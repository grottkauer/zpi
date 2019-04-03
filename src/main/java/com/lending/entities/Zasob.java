package com.lending.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zasoby")
public class Zasob extends EncjaBazowa{

    @Column
    private int punkty;

    @Column
    private String nazwa;

    @Column
    private String kolor;

    @Column
    private double waga;

    @ManyToOne
    @JoinColumn(name = "rodzajZasobuID")
    private RodzajZasobu rodzajZasobu;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zasob")
    private List<PosiadanieZasobu> posiadaniaZasobu = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zasob")
    private List<Zdjecie> zdjecia = new ArrayList<>();

    public Zasob(){

    }

    public Zasob(int punkty, String nazwa, String kolor, double waga, RodzajZasobu rodzajZasobu) {
        this.punkty = punkty;
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.waga = waga;
        this.rodzajZasobu = rodzajZasobu;
    }

    public RodzajZasobu getRodzajZasobu() {
        return rodzajZasobu;
    }

    public void setRodzajZasobuID(RodzajZasobu rodzajZasobu) {
        this.rodzajZasobu = rodzajZasobu;
    }

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public String toString(){
        return super.getId() + ", " + nazwa + "\n";
    }
}
