package com.lending.repositories;

import com.lending.entities.Zasob;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZasobRepository extends CrudRepository<Zasob, Integer> {

}
