package com.lending.repositories;

import com.lending.entities.PodkategoriaZasobu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodkategoriaZasobuRepository extends CrudRepository<PodkategoriaZasobu, Integer> {
}
