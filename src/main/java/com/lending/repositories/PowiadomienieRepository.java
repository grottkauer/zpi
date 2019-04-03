package com.lending.repositories;

import com.lending.entities.Powiadomienie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowiadomienieRepository extends CrudRepository<Powiadomienie, Integer> {
}
