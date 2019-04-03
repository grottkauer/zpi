package com.lending.repositories;

import com.lending.entities.PosiadanieZasobu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosiadanieZasobuRepository extends CrudRepository<PosiadanieZasobu, Integer> {
}
