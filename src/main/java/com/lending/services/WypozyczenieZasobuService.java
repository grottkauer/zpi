package com.lending.services;

import com.lending.entities.Uzytkownik;
import com.lending.entities.WypozyczenieZasobu;
import com.lending.entities.Zasob;
import com.lending.repositories.UzytkownikRepository;
import com.lending.repositories.WypozyczenieZasobuRepository;
import com.lending.repositories.ZasobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WypozyczenieZasobuService {

    private WypozyczenieZasobuRepository wypozyczenieZasobuRepository;

    @Autowired
    public WypozyczenieZasobuService(WypozyczenieZasobuRepository wypozyczenieZasobuRepository) {
        this.wypozyczenieZasobuRepository = wypozyczenieZasobuRepository;
    }

    public WypozyczenieZasobu getWypozyczenie(int id){
        return wypozyczenieZasobuRepository.findById(id).get();
    }

    public WypozyczenieZasobu createWypozyczenie(Uzytkownik dawca, Uzytkownik biorca, Zasob zasob){
        WypozyczenieZasobu wypozyczenieZasobu = new WypozyczenieZasobu();
        wypozyczenieZasobu.setDawca(dawca);
        wypozyczenieZasobu.setBiorca(biorca);
        wypozyczenieZasobu.setZasob(zasob);
        return wypozyczenieZasobuRepository.save(wypozyczenieZasobu);
    }
}
