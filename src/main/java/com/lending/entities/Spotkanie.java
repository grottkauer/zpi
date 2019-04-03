package com.lending.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "spotkania")
public class Spotkanie extends EncjaBazowa{

    @ManyToOne
    @JoinColumn(name = "adres_id")
    private Adres adres;

    @Column
    private String nazwa;

    @Column
    private Date dataSpotkania;

    private WypozyczenieZasobu wypozyczenieZasobu;

    public Spotkanie() {
    }

    public Spotkanie(Adres adres, String nazwa, Date dataSpotkania, WypozyczenieZasobu wypozyczenieZasobu) {
        this.adres = adres;
        this.nazwa = nazwa;
        this.dataSpotkania = dataSpotkania;
        this.wypozyczenieZasobu = wypozyczenieZasobu;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Date getDataSpotkania() {
        return dataSpotkania;
    }

    public void setDataSpotkania(Date dataSpotkania) {
        this.dataSpotkania = dataSpotkania;
    }

    public WypozyczenieZasobu getWypozyczenieZasobu() {
        return wypozyczenieZasobu;
    }

    public void setWypozyczenieZasobu(WypozyczenieZasobu wypozyczenieZasobu) {
        this.wypozyczenieZasobu = wypozyczenieZasobu;
    }
}
