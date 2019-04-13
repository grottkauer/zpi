package com.lending.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple8;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.2.0.
 */
public class BorrowMeContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50600080546001600160a01b031916331790556107ef806100326000396000f3fe608060405234801561001057600080fd5b50600436106100cf5760003560e01c8063bf95f9591161008c578063d44bce2a11610066578063d44bce2a14610286578063d68bbff9146102a3578063fa5f0364146102c0578063fe1a9243146102dd576100cf565b8063bf95f95914610216578063c01633dd14610233578063d282737f14610250576100cf565b80630ab7e79d146100d4578063252a9dbb146100f357806326c638f814610122578063870589581461015b57806394fd7e46146101785780639c4175e114610180575b600080fd5b6100f1600480360360208110156100ea57600080fd5b503561031e565b005b6101106004803603602081101561010957600080fd5b503561037e565b60408051918252519081900360200190f35b61013f6004803603602081101561013857600080fd5b50356103a6565b604080516001600160a01b039092168252519081900360200190f35b6100f16004803603602081101561017157600080fd5b50356103d8565b61011061040a565b61019d6004803603602081101561019657600080fd5b5035610410565b60405180898152602001886001600160a01b03166001600160a01b03168152602001876001600160a01b03166001600160a01b031681526020018681526020018581526020018481526020018381526020018260028111156101fb57fe5b60ff1681526020019850505050505050505060405180910390f35b6101106004803603602081101561022c57600080fd5b5035610472565b6101106004803603602081101561024957600080fd5b503561049a565b6100f16004803603606081101561026657600080fd5b506001600160a01b038135811691602081013590911690604001356104c2565b61019d6004803603602081101561029c57600080fd5b50356105d8565b610110600480360360208110156102b957600080fd5b50356106dc565b61013f600480360360208110156102d657600080fd5b5035610704565b6102fa600480360360208110156102f357600080fd5b5035610736565b6040518082600281111561030a57fe5b60ff16815260200191505060405180910390f35b426001828154811061032c57fe5b906000526020600020906008020160050181905550600180828154811061034f57fe5b60009182526020909120600760089092020101805460ff1916600183600281111561037657fe5b021790555050565b60006001828154811061038d57fe5b9060005260206000209060080201600501549050919050565b6000600182815481106103b557fe5b60009182526020909120600890910201600201546001600160a01b031692915050565b42600182815481106103e657fe5b90600052602060002090600802016006018190555060026001828154811061034f57fe5b60025481565b6001818154811061041d57fe5b6000918252602090912060089091020180546001820154600283015460038401546004850154600586015460068701546007909701549597506001600160a01b03948516969490931694919390929160ff1688565b60006001828154811061048157fe5b9060005260206000209060080201600601549050919050565b6000600182815481106104a957fe5b9060005260206000209060080201600301549050919050565b60016040518061010001604052806002548152602001856001600160a01b03168152602001846001600160a01b0316815260200183815260200142815260200160008152602001600081526020016000600281111561051d57fe5b905281546001808201808555600094855260209485902084516008909402019283559383015182820180546001600160a01b03199081166001600160a01b039384161790915560408501516002808601805490931691909316179055606084015160038401556080840151600484015560a0840151600584015560c0840151600684015560e08401516007840180549193909260ff199092169184908111156105c257fe5b0217905550506002805460010190555050505050565b6000806000806000806000806105ec610762565b60018a815481106105f957fe5b6000918252602091829020604080516101008101825260089093029091018054835260018101546001600160a01b0390811694840194909452600280820154909416918301919091526003810154606083015260048101546080830152600581015460a0830152600681015460c083015260078101549192909160e084019160ff9091169081111561068757fe5b600281111561069257fe5b815250509050806000015181602001518260400151836060015184608001518560a001518660c001518760e001519850985098509850985098509850985050919395975091939597565b6000600182815481106106eb57fe5b9060005260206000209060080201600401549050919050565b60006001828154811061071357fe5b60009182526020909120600890910201600101546001600160a01b031692915050565b60006001828154811061074557fe5b600091825260209091206008909102016007015460ff1692915050565b6040518061010001604052806000815260200160006001600160a01b0316815260200160006001600160a01b0316815260200160008152602001600081526020016000815260200160008152602001600060028111156107be57fe5b90529056fea165627a7a72305820ecb166361215ec26837ff62a3b6530000e3c408d62a7a9b8e1fd0d0d006c76790029";

    public static final String FUNC_REALIZEBORROWING = "realizeBorrowing";

    public static final String FUNC_GETBORROWINGREALISATIONDATE = "getBorrowingRealisationDate";

    public static final String FUNC_GETBORROWINGBORROWER = "getBorrowingBorrower";

    public static final String FUNC_RETURNBORROWING = "returnBorrowing";

    public static final String FUNC_BORROWINGSCOUNT = "borrowingsCount";

    public static final String FUNC_BORROWINGS = "borrowings";

    public static final String FUNC_GETBORROWINGRETURNDATE = "getBorrowingReturnDate";

    public static final String FUNC_GETBORROWINGRESOURCEID = "getBorrowingResourceID";

    public static final String FUNC_CREATEBORROWING = "createBorrowing";

    public static final String FUNC_GETBORROWING = "getBorrowing";

    public static final String FUNC_GETBORROWINGCREATEDATE = "getBorrowingCreateDate";

    public static final String FUNC_GETBORROWINGOWNER = "getBorrowingOwner";

    public static final String FUNC_GETBORROWINGSTATUS = "getBorrowingStatus";

    @Deprecated
    protected BorrowMeContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected BorrowMeContract(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected BorrowMeContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected BorrowMeContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> realizeBorrowing(BigInteger borrowingID) {
        final Function function = new Function(
                FUNC_REALIZEBORROWING, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(borrowingID)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getBorrowingRealisationDate(BigInteger borrowingID) {
        final Function function = new Function(FUNC_GETBORROWINGREALISATIONDATE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(borrowingID)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getBorrowingBorrower(BigInteger borrowingID) {
        final Function function = new Function(FUNC_GETBORROWINGBORROWER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(borrowingID)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> returnBorrowing(BigInteger borrowingID) {
        final Function function = new Function(
                FUNC_RETURNBORROWING, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(borrowingID)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> borrowingsCount() {
        final Function function = new Function(FUNC_BORROWINGSCOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Tuple8<BigInteger, String, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>> borrowings(BigInteger param0) {
        final Function function = new Function(FUNC_BORROWINGS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint8>() {}));
        return new RemoteCall<Tuple8<BigInteger, String, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>>(
                new Callable<Tuple8<BigInteger, String, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple8<BigInteger, String, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple8<BigInteger, String, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (String) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (BigInteger) results.get(4).getValue(), 
                                (BigInteger) results.get(5).getValue(), 
                                (BigInteger) results.get(6).getValue(), 
                                (BigInteger) results.get(7).getValue());
                    }
                });
    }

    public RemoteCall<BigInteger> getBorrowingReturnDate(BigInteger borrowingID) {
        final Function function = new Function(FUNC_GETBORROWINGRETURNDATE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(borrowingID)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getBorrowingResourceID(BigInteger borrowingID) {
        final Function function = new Function(FUNC_GETBORROWINGRESOURCEID, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(borrowingID)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> createBorrowing(String _owner, String _borrower, BigInteger _resourceID) {
        final Function function = new Function(
                FUNC_CREATEBORROWING, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner), 
                new org.web3j.abi.datatypes.Address(_borrower), 
                new org.web3j.abi.datatypes.generated.Uint256(_resourceID)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Tuple8<BigInteger, String, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>> getBorrowing(BigInteger _borrowingID) {
        final Function function = new Function(FUNC_GETBORROWING, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_borrowingID)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint8>() {}));
        return new RemoteCall<Tuple8<BigInteger, String, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>>(
                new Callable<Tuple8<BigInteger, String, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple8<BigInteger, String, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple8<BigInteger, String, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (String) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (BigInteger) results.get(4).getValue(), 
                                (BigInteger) results.get(5).getValue(), 
                                (BigInteger) results.get(6).getValue(), 
                                (BigInteger) results.get(7).getValue());
                    }
                });
    }

    public RemoteCall<BigInteger> getBorrowingCreateDate(BigInteger borrowingID) {
        final Function function = new Function(FUNC_GETBORROWINGCREATEDATE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(borrowingID)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getBorrowingOwner(BigInteger borrowingID) {
        final Function function = new Function(FUNC_GETBORROWINGOWNER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(borrowingID)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getBorrowingStatus(BigInteger borrowingID) {
        final Function function = new Function(FUNC_GETBORROWINGSTATUS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(borrowingID)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static BorrowMeContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new BorrowMeContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static BorrowMeContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new BorrowMeContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static BorrowMeContract load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new BorrowMeContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static BorrowMeContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new BorrowMeContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<BorrowMeContract> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(BorrowMeContract.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<BorrowMeContract> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(BorrowMeContract.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<BorrowMeContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(BorrowMeContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<BorrowMeContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(BorrowMeContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
