package com.lending.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posiadaniaZasobu")
public class PosiadanieZasobu extends EncjaBazowa{

    @Column(nullable = false)
    private Date dataDodania;

    @ManyToOne
    @JoinColumn(name = "uzytkownik_id")
    private Uzytkownik uzytkownik;

    @ManyToOne
    @JoinColumn(name = "zasob_id")
    private Zasob zasob;

    public PosiadanieZasobu() {
    }

    public PosiadanieZasobu(Date dataDodania, Uzytkownik uzytkownik, Zasob zasob) {
        this.dataDodania = dataDodania;
        this.uzytkownik = uzytkownik;
        this.zasob = zasob;
    }

    public Date getDataDodania() {
        return dataDodania;
    }

    public void setDataDodania(Date dataDodania) {
        this.dataDodania = dataDodania;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(Uzytkownik uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public Zasob getZasob() {
        return zasob;
    }

    public void setZasob(Zasob zasob) {
        this.zasob = zasob;
    }
}
