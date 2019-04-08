package com.lending.repositories;

import com.lending.entities.Resource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZasobRepository extends CrudRepository<Resource, Integer> {

}
