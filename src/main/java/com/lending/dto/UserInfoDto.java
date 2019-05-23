package com.lending.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UserInfoDto {

    private String firstName;
    private String lastName;
    private String email;
    @DateTimeFormat(pattern = "dd/MM/yyyy") private Date birthDate;
    private String zipCode;
    private String locality;
    private String street;
    private String nrHouse;
    private String nrFlat;

    public UserInfoDto(String firstName, String lastName, String email, Date birthDate, String zipCode,
                       String locality, String street, String nrHouse, String nrFlat) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.zipCode = zipCode;
        this.locality = locality;
        this.street = street;
        this.nrHouse = nrHouse;
        this.nrFlat = nrFlat;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNrHouse() {
        return nrHouse;
    }

    public void setNrHouse(String nrHouse) {
        this.nrHouse = nrHouse;
    }

    public String getNrFlat() {
        return nrFlat;
    }

    public void setNrFlat(String nrFlat) {
        this.nrFlat = nrFlat;
    }
}
