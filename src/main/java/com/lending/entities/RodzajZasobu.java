package com.lending.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
public class RodzajZasobu {
    @Id
    @Column(name = "rodzajzasobuID")
    private int rodzajZasobuID;

    @Column
    private String nazwa;

    @Column
    private String dataDodania;

    @OneToMany(mappedBy = "rodzajZasobu", cascade = CascadeType.ALL)
    private List<Zasob> zasoby;

    @OneToMany(mappedBy = "stopienWyzej", cascade = CascadeType.ALL)
    private List<RodzajZasobu> stopnieWyzej;

    @ManyToOne
    @JoinColumn(name = "stopienWyzejID")
    private RodzajZasobu stopienWyzej;

    public RodzajZasobu(){

    }

    public RodzajZasobu(int rodzajZasobuID, String nazwa, String dataDodania) {
        this.rodzajZasobuID = rodzajZasobuID;
        this.nazwa = nazwa;
        this.dataDodania = dataDodania;
    }

    public RodzajZasobu(int rodzajZasobuID, String nazwa, String dataDodania, RodzajZasobu stopienWyzej) {
        this.rodzajZasobuID = rodzajZasobuID;
        this.nazwa = nazwa;
        this.dataDodania = dataDodania;
        this.stopienWyzej = stopienWyzej;
    }

    public RodzajZasobu getStopienWyzej() {
        return stopienWyzej;
    }

    public void setStopienWyzej(RodzajZasobu stopienWyzej) {
        this.stopienWyzej = stopienWyzej;
    }

    public List<RodzajZasobu> getStopnieWyzej() {
        return stopnieWyzej;
    }

    public void setStopnieWyzej(List<RodzajZasobu> stopnieWyzej) {
        this.stopnieWyzej = stopnieWyzej;
    }

    public List<Zasob> getZasoby() {
        return zasoby;
    }

    public void setZasoby(List<Zasob> zasoby) {
        this.zasoby = zasoby;
    }

    public int getRodzajZasobuID() {
        return rodzajZasobuID;
    }

    public void setRodzajZasobuID(int rodzajZasobuID) {
        this.rodzajZasobuID = rodzajZasobuID;
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

    @Override
    public String toString() {
        return "Rodzaj zasobu [id = " + rodzajZasobuID + ", nazwa = " + nazwa + ", data dodania = " + dataDodania + "]\n";
    }
}
