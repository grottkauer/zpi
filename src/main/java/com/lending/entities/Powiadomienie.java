package com.lending.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "powiadomienia")
public class Powiadomienie extends EncjaBazowa{

    @ManyToOne
    @JoinColumn(name = "nadawcaID")
    private Uzytkownik nadawca;

    @ManyToOne
    @JoinColumn(name = "odbiorcaID")
    private Uzytkownik odbiorca;

    @Column(nullable = false)
    private String tytul;

    @Column(nullable = false)
    private String opis;

    @Column(nullable = false)
    private Date dataWyslania;

    @Column
    private Date dataOtwarcia;

    public Powiadomienie() {
    }

    public Powiadomienie(Uzytkownik nadawca, Uzytkownik odbiorca, String tytul, String opis, Date dataWyslania, Date dataOtwarcia) {
        this.nadawca = nadawca;
        this.odbiorca = odbiorca;
        this.tytul = tytul;
        this.opis = opis;
        this.dataWyslania = dataWyslania;
        this.dataOtwarcia = dataOtwarcia;
    }

    public Uzytkownik getNadawca() {
        return nadawca;
    }

    public void setNadawca(Uzytkownik nadawca) {
        this.nadawca = nadawca;
    }

    public Uzytkownik getOdbiorca() {
        return odbiorca;
    }

    public void setOdbiorca(Uzytkownik odbiorca) {
        this.odbiorca = odbiorca;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Date getDataWyslania() {
        return dataWyslania;
    }

    public void setDataWyslania(Date dataWyslania) {
        this.dataWyslania = dataWyslania;
    }

    public Date getDataOtwarcia() {
        return dataOtwarcia;
    }

    public void setDataOtwarcia(Date dataOtwarcia) {
        this.dataOtwarcia = dataOtwarcia;
    }
}
