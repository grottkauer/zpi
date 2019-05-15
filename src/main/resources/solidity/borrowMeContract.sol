pragma solidity ^0.5.1;

contract BorrowMeContract{
    
    enum Status {Created, Realized, Returned}
    
    struct Borrowing{
        uint borrowingID;
        address owner;
        address borrower;
        uint resourceID;
        uint createDate;
        uint borrowDate;
        uint returnDate;
        Status status;
    }
    
    address contractOwner; //borrowMeCompany
    //mapping(uint => Borrowing) borrowings;
    Borrowing[] public borrowings;
    uint public borrowingsCount;
    
    constructor() public{
        contractOwner = msg.sender;
    }
    
    function getBorrowing(uint _borrowingID) public view returns (uint, address, address, uint, uint, uint, uint, Status){
        Borrowing memory b = borrowings[_borrowingID];
        return (b.borrowingID, b.owner, b.borrower, b.resourceID, b.createDate, b.borrowDate, b.returnDate, b.status);
    }
    
    function createBorrowing(address _owner, address _borrower, uint _resourceID) public {
        borrowings.push(Borrowing(borrowingsCount, _owner, _borrower, _resourceID, block.timestamp, 0, 0, Status.Created));
        borrowingsCount++;
    }
    
    function returnBorrowing(uint borrowingID) public {
        borrowings[borrowingID].returnDate = block.timestamp;
        borrowings[borrowingID].status = Status.Returned;
    }
    
    function realizeBorrowing(uint borrowingID) public {
        borrowings[borrowingID].borrowDate = block.timestamp;
        borrowings[borrowingID].status = Status.Realized;
    }
    
    function getBorrowingOwner(uint borrowingID) public view returns (address) {
        return borrowings[borrowingID].owner;
    }
    
    function getBorrowingBorrower(uint borrowingID) public view returns (address) {
        return borrowings[borrowingID].borrower;
    }
    
    function getBorrowingResourceID(uint borrowingID) public view returns (uint) {
        return borrowings[borrowingID].resourceID;
    }
    
    function getBorrowingCreateDate(uint borrowingID) public view returns (uint) {
        return borrowings[borrowingID].createDate;
    }
    
    function getBorrowingRealisationDate(uint borrowingID) public view returns (uint) {
        return borrowings[borrowingID].borrowDate;
    }
    
    function getBorrowingReturnDate(uint borrowingID) public view returns (uint) {
        return borrowings[borrowingID].returnDate;
    }
    
    function getBorrowingStatus(uint borrowingID) public view returns (Status) {
        return borrowings[borrowingID].status;
    }
}