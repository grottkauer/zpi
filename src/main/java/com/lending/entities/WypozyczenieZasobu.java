package com.lending.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.util.Date;

@Component
public class WypozyczenieZasobu extends EncjaBazowa{

    public enum StatusWypozyczenia{
        Utworzone, Zrealizowane, Oddane;

        public static StatusWypozyczenia fromInteger(int integer){
            switch (integer){
                case 0:
                    return Utworzone;
                case 1:
                    return Zrealizowane;
                case 2:
                    return Oddane;
            }
            return null;
        }
    }

    private Uzytkownik dawca;

    private Uzytkownik biorca;

    private Zasob zasob;

    private Date dataDodania;

    private Date dataRealizacji;

    private Date dataOddania;

    private StatusWypozyczenia statusWypozyczenia;

    public WypozyczenieZasobu() {
    }

    public WypozyczenieZasobu(int id, Uzytkownik dawca, Uzytkownik biorca, Zasob zasob, Date dataDodania, Date dataRealizacji, Date dataOddania, StatusWypozyczenia statusWypozyczenia) {
        super(id);
        this.dawca = dawca;
        this.biorca = biorca;
        this.zasob = zasob;
        this.dataDodania = dataDodania;
        this.dataRealizacji = dataRealizacji;
        this.dataOddania = dataOddania;
        this.statusWypozyczenia = statusWypozyczenia;
    }

    public Uzytkownik getDawca() {
        return dawca;
    }

    public void setDawca(Uzytkownik dawca) {
        this.dawca = dawca;
    }

    public Uzytkownik getBiorca() {
        return biorca;
    }

    public void setBiorca(Uzytkownik biorca) {
        this.biorca = biorca;
    }

    public Zasob getZasob() {
        return zasob;
    }

    public void setZasob(Zasob zasob) {
        this.zasob = zasob;
    }

    public Date getDataDodania() {
        return dataDodania;
    }

    public void setDataDodania(Date dataDodania) {
        this.dataDodania = dataDodania;
    }

    public Date getDataRealizacji() {
        return dataRealizacji;
    }

    public void setDataRealizacji(Date dataRealizacji) {
        this.dataRealizacji = dataRealizacji;
    }

    public Date getDataOddania() {
        return dataOddania;
    }

    public void setDataOddania(Date dataOddania) {
        this.dataOddania = dataOddania;
    }

    public StatusWypozyczenia getStatusWypozyczenia() {
        return statusWypozyczenia;
    }

    public void setStatusWypozyczenia(StatusWypozyczenia statusWypozyczenia) {
        this.statusWypozyczenia = statusWypozyczenia;
    }
}
