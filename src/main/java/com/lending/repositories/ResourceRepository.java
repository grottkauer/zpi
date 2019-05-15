package com.lending.repositories;

import com.lending.entities.Resource;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ResourceRepository extends CrudRepository<Resource, Integer> {

    @Query("select r from Resource r join r.resourceType rt where rt.resourceTypeID=:id")
    Iterable<Resource> findByResourceTypeId(@Param("id") int id);

    //@Query("select r from Resource res where res.resourceID=:id")
    //Iterable<Resource> findByResourceId(@Param("id") int id);
}
