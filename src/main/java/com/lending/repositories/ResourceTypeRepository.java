package com.lending.repositories;

import com.lending.entities.ResourceType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceTypeRepository extends CrudRepository<ResourceType, Integer> {

    @Query("select * from resource_type rt where rt.resource_typeid = ?1")
    List<ResourceType> findAllInHigherCategory(int resourceTypeId);
}
