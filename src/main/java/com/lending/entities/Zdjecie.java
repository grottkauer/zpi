package com.lending.entities;

import javax.persistence.*;

@Entity
@Table(name = "zdjecia")
public class Zdjecie extends EncjaBazowa{

    @ManyToOne
    @JoinColumn(name = "zasob_id")
    private Zasob zasob;

    @Column(nullable = false)
    private String NazwaObrazka;

    @Column(nullable = false)
    private String SciezkaPliku;

    public Zdjecie() {
    }

    public Zdjecie(Zasob zasob, String nazwaObrazka, String sciezkaPliku) {
        this.zasob = zasob;
        NazwaObrazka = nazwaObrazka;
        SciezkaPliku = sciezkaPliku;
    }

    public Zasob getZasob() {
        return zasob;
    }

    public void setZasob(Zasob zasob) {
        this.zasob = zasob;
    }

    public String getNazwaObrazka() {
        return NazwaObrazka;
    }

    public void setNazwaObrazka(String nazwaObrazka) {
        NazwaObrazka = nazwaObrazka;
    }

    public String getSciezkaPliku() {
        return SciezkaPliku;
    }

    public void setSciezkaPliku(String sciezkaPliku) {
        SciezkaPliku = sciezkaPliku;
    }
}
