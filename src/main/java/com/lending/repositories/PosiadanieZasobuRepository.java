package com.lending.repositories;

import com.lending.entities.ResourceOwnership;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosiadanieZasobuRepository extends CrudRepository<ResourceOwnership, Integer> {
}
