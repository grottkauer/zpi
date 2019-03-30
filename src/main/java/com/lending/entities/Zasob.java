package com.lending.entities;

import javax.persistence.*;

@Entity
public class Zasob {
    @Id
    private int zasobID;

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

    public Zasob(){

    }

    public Zasob(int zasobID, int punkty, String nazwa, String kolor, double waga, RodzajZasobu rodzajZasobu) {
        this.zasobID = zasobID;
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

    public int getZasobID() {
        return zasobID;
    }

    public void setZasobID(int zasobID) {
        this.zasobID = zasobID;
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
        return zasobID + ", " + nazwa + "\n";
    }
}
