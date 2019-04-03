package com.lending.repositories;

import com.lending.entities.Adres;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresRepository extends CrudRepository<Adres, Integer> {
}
