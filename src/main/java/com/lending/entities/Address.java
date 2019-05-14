package com.lending.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address extends BaseEntity {


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
}
