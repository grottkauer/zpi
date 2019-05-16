package com.lending.dto;

import java.util.Date;

public class ResourceRentingHistoryDto {

    private Date borrowDate;
    private String user;
    private Date giveBackDate;

    public ResourceRentingHistoryDto(Date borrowDate, String user, Date giveBackDate) {
        this.borrowDate = borrowDate;
        this.user = user;
        this.giveBackDate = giveBackDate;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getUser() {
        return user;
    }

    public Date getGiveBackDate() {
        return giveBackDate;
    }

    public void setGiveBackDate(Date giveBackDate) {
        this.giveBackDate = giveBackDate;
    }
}
