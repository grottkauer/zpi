package com.lending.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class PodkategoriaZasobu {
    @Id
    @Column(name = "podkategoriaZasobuID")
    private int podkategoriaZasobuID;

    @Column
    private String nazwa;

    @Column
    private String dataDodania;

    @ManyToOne
    @JoinColumn(name = "rodzajZasobuID")
    private RodzajZasobu rodzajZasobu;

    public PodkategoriaZasobu(){

    }

    public PodkategoriaZasobu(int podkategoriaZasobuID, String nazwa, String dataDodania, RodzajZasobu rodzajZasobu) {
        this.podkategoriaZasobuID = podkategoriaZasobuID;
        this.nazwa = nazwa;
        this.dataDodania = dataDodania;
        this.rodzajZasobu = rodzajZasobu;
    }

    public int getPodkategoriaZasobuID() {
        return podkategoriaZasobuID;
    }

    public void setPodkategoriaZasobuID(int podkategoriaZasobuID) {
        this.podkategoriaZasobuID = podkategoriaZasobuID;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getDataDodania() {
        return dataDodania;
    }

    public void setDataDodania(String dataDodania) {
        this.dataDodania = dataDodania;
    }

    public RodzajZasobu getRodzajZasobu() {
        return rodzajZasobu;
    }

    public void setRodzajZasobu(RodzajZasobu rodzajZasobu) {
        this.rodzajZasobu = rodzajZasobu;
    }
}
