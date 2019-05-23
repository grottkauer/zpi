package com.lending.entities;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(nullable = false)
    private String locality;

    @Column
    private String street;

    @Column(nullable = false)
    private String nrHouse;

    @Column
    private String nrFlat;

    @Column(nullable = false)
    private String zipCode;


    public Address() {

    }

    public Address(String locality, String street, String nrHouse, String nrFlat, String zipCode) {
        this.locality = locality;
        this.street = street;
        this.nrHouse = nrHouse;
        this.nrFlat = nrFlat;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
