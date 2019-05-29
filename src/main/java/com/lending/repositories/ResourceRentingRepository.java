package com.lending.repositories;

import com.lending.entities.ResourceRenting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ResourceRentingRepository extends CrudRepository<ResourceRenting, Integer> {



}
