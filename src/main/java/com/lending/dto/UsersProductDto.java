package com.lending.dto;

import com.lending.entities.RentingStatus;

import java.util.Date;

public class UsersProductDto {

    private int id;
    private String productName;
    private String categoryName;
    private Date addDate;
    private RentingStatus status;
    private boolean canBeBorrowed;

    public UsersProductDto(int id, String productName, String categoryName, Date addDate,
                           RentingStatus status, boolean canBeBorrowed) {
        this.id = id;
        this.productName = productName;
        this.categoryName = categoryName;
        this.addDate = addDate;
        this.status = status;
        this.canBeBorrowed = canBeBorrowed;
    }

    public UsersProductDto(int id, String productName, String categoryName, Date addDate) {
        this.id = id;
        this.productName = productName;
        this.categoryName = categoryName;
        this.addDate = addDate;
        this.status = null;
        this.canBeBorrowed = false;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public RentingStatus getStatus() {
        return status;
    }

    public void setStatus(RentingStatus status) {
        this.status = status;
    }

    public boolean isCanBeBorrowed() {
        return canBeBorrowed;
    }

    public void setCanBeBorrowed(boolean canBeBorrowed) {
        this.canBeBorrowed = canBeBorrowed;
    }

    public int getId() {
        return id;
    }
}
