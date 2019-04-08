package com.lending.repositories;

import com.lending.entities.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZdjecieRepository extends CrudRepository<Image, Integer> {
}
