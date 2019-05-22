package com.lending.repositories;

import com.lending.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl implements UserRepositoryCustom {


    @Autowired
    @Lazy
    UserRepository userRepository;

    public Person getUserByEthereumKey(String ethereumKey) {

        for (Person u: userRepository.findAll()) {
            if(u.getEthereumKey().equals(ethereumKey))
                return u;
        }
        return null;
    }

    public Person getUserByEthereumAddress(String ethereumAddress) {

        for (Person u: userRepository.findAll()) {
            if(u.getEthereumAddress().toLowerCase().equals(ethereumAddress.toLowerCase()))
                return u;
        }
        return null;
    }

}
