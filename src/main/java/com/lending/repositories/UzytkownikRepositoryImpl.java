package com.lending.repositories;

import com.lending.entities.Uzytkownik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class UzytkownikRepositoryImpl implements UzytkownikRepositoryCustom {


    @Autowired
    @Lazy
    UzytkownikRepository uzytkownikRepository;

    public Uzytkownik getUzytkownikByKluczEthereum(String kluczEthereum) {

        for (Uzytkownik u: uzytkownikRepository.findAll()) {
            if(u.getKluczEthereum().equals(kluczEthereum))
                return u;
        }
        return null;
    }
}
