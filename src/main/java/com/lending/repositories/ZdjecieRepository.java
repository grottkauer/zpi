package com.lending.repositories;

import com.lending.entities.Zdjecie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZdjecieRepository extends CrudRepository<Zdjecie, Integer> {
}
