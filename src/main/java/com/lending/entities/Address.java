package com.lending.entities;

import javax.persistence.*;

@Entity
@Table(name = "adresy")
public class Address extends EncjaBazowa{


    @Column(nullable = false)
    private String locality;

    @Column
    private String street;

    @Column(nullable = false)
    private String nrHouse;

    @Column
    private String nrFlat;

    public Address() {
    }

    public Address(String locality, String street, String nrHouse, String nrFlat) {
        this.locality = locality;
        this.street = street;
        this.nrHouse = nrHouse;
        this.nrFlat = nrFlat;
    }
}
