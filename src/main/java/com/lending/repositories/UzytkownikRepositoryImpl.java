package com.lending.repositories;

import com.lending.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class UzytkownikRepositoryImpl implements UzytkownikRepositoryCustom {


    @Autowired
    @Lazy
    UzytkownikRepository uzytkownikRepository;

    public User getUzytkownikByKluczEthereum(String kluczEthereum) {

        for (User u: uzytkownikRepository.findAll()) {
            if(u.getEthereumKey().equals(kluczEthereum))
                return u;
        }
        return null;
    }
}
