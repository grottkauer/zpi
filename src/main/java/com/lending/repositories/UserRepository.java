package com.lending.repositories;

import com.lending.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer>, UserRepositoryCustom {

    @Query("select u from User u where u.email=:email")
    User findByEmail(@Param("email") String email);

    @Query("select case when count(u) > 0 then true else false end from User u where u.email=:email")
    boolean checkIfUserExists(@Param("email") String email);

    @Query("select case when u.password=:password then true else false end from User u where u.email=:email")
    boolean checkIfCredentialsAreCorrect(@Param("email") String email, @Param("password") String password);

    @Query("select u.id from User u where u.email=:email")
    int getUserIdByEmail(@Param("email") String email);

}
