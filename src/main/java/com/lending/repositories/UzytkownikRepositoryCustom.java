package com.lending.repositories;

import com.lending.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UzytkownikRepositoryCustom {
    User getUzytkownikByKluczEthereum(String kluczEthereum);
    User getUzytkownikByEthereumAddress(String ethereumAddress);
}
