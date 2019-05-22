package com.lending.dto;

public class BorrowingUserInfoDto {

    private String firstName;
    private String lastName;
    private String email;
    private String locality;

    public BorrowingUserInfoDto(String firstName, String lastName, String email, String locality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.locality = locality;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getLocality() {
        return locality;
    }
}
