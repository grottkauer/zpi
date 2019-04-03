package com.lending.repositories;

import com.lending.entities.Uzytkownik;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UzytkownikRepository extends CrudRepository<Uzytkownik, Integer>, UzytkownikRepositoryCustom {
}
