package com.lending.repositories;

import com.lending.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryCustom {
    User getUserByEthereumKey(String kluczEthereum);
    User getUserByEthereumAddress(String ethereumAddress);
}
