package com.lending.entities;

import javax.persistence.*;

@Entity
@Table(name = "adresy")
public class Adres extends EncjaBazowa{


    @Column(nullable = false)
    private String miejscowosc;

    @Column
    private String ulica;

    @Column(nullable = false)
    private String nrDomu;

    @Column
    private String nrMieszkania;

    public Adres() {
    }

    public Adres(String miejscowosc, String ulica, String nrDomu, String nrMieszkania) {
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrMieszkania = nrMieszkania;
    }
}
