package com.lending.repositories;

import com.lending.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UzytkownikRepository extends CrudRepository<User, Integer>, UzytkownikRepositoryCustom {
}
