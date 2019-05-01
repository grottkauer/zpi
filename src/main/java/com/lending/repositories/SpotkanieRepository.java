package com.lending.repositories;

import com.lending.entities.Meeting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpotkanieRepository extends CrudRepository<Meeting, Integer> {
}