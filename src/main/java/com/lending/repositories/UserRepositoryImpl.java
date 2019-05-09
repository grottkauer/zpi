package com.lending.repositories;

import com.lending.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl implements UserRepositoryCustom {


    @Autowired
    @Lazy
    UserRepository userRepository;

    public User getUserByEthereumKey(String ethereumKey) {

        for (User u: userRepository.findAll()) {
            if(u.getEthereumKey().equals(ethereumKey))
                return u;
        }
        return null;
    }

    public User getUserByEthereumAddress(String ethereumAddress) {

        for (User u: userRepository.findAll()) {
            if(u.getEthereumAddress().toLowerCase().equals(ethereumAddress.toLowerCase()))
                return u;
        }
        return null;
    }

}
