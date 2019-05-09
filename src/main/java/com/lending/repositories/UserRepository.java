package com.lending.repositories;

import com.lending.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>, UserRepositoryCustom {
}
