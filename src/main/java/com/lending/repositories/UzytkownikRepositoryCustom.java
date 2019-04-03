package com.lending.repositories;

import com.lending.entities.Uzytkownik;
import org.springframework.stereotype.Repository;

@Repository
public interface UzytkownikRepositoryCustom {
    Uzytkownik getUzytkownikByKluczEthereum(String kluczEthereum);
}
