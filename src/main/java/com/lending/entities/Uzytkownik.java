package com.lending.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "uzytkownicy")
public class Uzytkownik extends EncjaBazowa{

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String haslo;

    @Column(nullable = false)
    private String kluczEthereum;

    @Column(nullable = false)
    private String email;

    @Column
    private String nazwisko;

    @Column
    private String imie;

    @Column(nullable = false)
    private Date dataDolaczenia;

    @Column
    private Date dataUrodzenia;

    @Column
    private Date dataWygaszenia;

    @ManyToOne
    @JoinColumn(name = "adres_id")
    private Adres adres;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nadawca")
    List<Powiadomienie> wyslanePowiadomienia = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "odbiorca")
    List<Powiadomienie> odebranePowiadomienia = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "uzytkownik")
    List<PosiadanieZasobu> posiadaniaZasobu;

    public Uzytkownik() {
    }

    public Uzytkownik(String login, String haslo, String kluczEthereum, String email, String nazwisko, String imie, Date dataDolaczenia, Date dataUrodzenia, Date dataWygaszenia, Adres adres) {
        this.login = login;
        this.haslo = haslo;
        this.kluczEthereum = kluczEthereum;
        this.email = email;
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.dataDolaczenia = dataDolaczenia;
        this.dataUrodzenia = dataUrodzenia;
        this.dataWygaszenia = dataWygaszenia;
        this.adres = adres;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public String getKluczEthereum() {
        return kluczEthereum;
    }

    public void setKluczEthereum(String kluczEthereum) {
        this.kluczEthereum = kluczEthereum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Date getDataDolaczenia() {
        return dataDolaczenia;
    }

    public void setDataDolaczenia(Date dataDolaczenia) {
        this.dataDolaczenia = dataDolaczenia;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public Date getDataWygaszenia() {
        return dataWygaszenia;
    }

    public void setDataWygaszenia(Date dataWygaszenia) {
        this.dataWygaszenia = dataWygaszenia;
    }

    @Override
    public String toString() {
        return "Uzytkownik{" +
                "ID=" + super.getId() +
                ", email='" + email + '\'' +
                '}';
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}
