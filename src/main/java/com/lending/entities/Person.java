package com.lending.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "person")
public class Person extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

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

    @Column
    private long wallet;

    @Column(nullable = false)
    private String ethereumAddress;

    @Column(nullable = false)
    private String ethereumKey;

    @ManyToOne
    @JoinColumn(name = "id_address")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    List<Resource> owningResources = new ArrayList<>();


    public Person() {

    }

    public Person(String password, String ethereumAddress, String ethereumKey, String email, String lastName, String firstName, Date joinDate, Date birthDate, Date recallDate, Address address) {
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
        this.wallet = 0;
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

    public long getWallet() {
        return wallet;
    }

    public void setWallet(long wallet) {
        this.wallet = wallet;
    }

    public void addToWallet(int coins) {
        this.wallet += (long) coins;
    }

    public void removeFromWallet(int coins) {
        if (this.wallet > coins)
            this.wallet -= (long) coins;
        else
            this.wallet = 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + super.getId_resource() +
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

    public int getId() {
        return id;
    }
}
