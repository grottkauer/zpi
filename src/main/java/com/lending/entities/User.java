package com.lending.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private Date joinDate;

    @Column
    private Date birthDate;

    @Column
    private Date recallDate;

    @Column(nullable = false)
    private String ethereumAddress;

    @Column(nullable = false)
    private String ethereumKey;

    @ManyToOne
    @JoinColumn(name = "id_address")
    private Address address;


    public User(String password, String ethereumAddress, String ethereumKey, String email, String lastName, String firstName, Date joinDate, Date birthDate, Date recallDate, Address address) {
        this.password = password;
        this.ethereumAddress = ethereumAddress;
        this.ethereumKey = ethereumKey;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.joinDate = joinDate;
        this.birthDate = birthDate;
        this.recallDate = recallDate;
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEthereumKey() {
        return ethereumKey;
    }

    public void setEthereumKey(String ethereumKey) {
        this.ethereumKey = ethereumKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getRecallDate() {
        return recallDate;
    }

    public void setRecallDate(Date recallDate) {
        this.recallDate = recallDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + super.getId() +
                ", email='" + email + '\'' +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEthereumAddress() {
        return ethereumAddress;
    }

    public void setEthereumAddress(String ethereumAddress) {
        this.ethereumAddress = ethereumAddress;
    }
}
