package com.lending.repositories;

import com.lending.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UzytkownikRepository extends CrudRepository<User, Integer>, UzytkownikRepositoryCustom {
}
