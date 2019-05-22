package com.lending.repositories;

import com.lending.entities.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryCustom {
    Person getUserByEthereumKey(String kluczEthereum);
    Person getUserByEthereumAddress(String ethereumAddress);
}
