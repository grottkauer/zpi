package com.lending.repositories;

import com.lending.entities.ResourceType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceTypeRepository extends CrudRepository<ResourceType, Integer> {

    @Query("select rt from ResourceType rt join rt.higherLevel hl where hl.resourceTypeID=:id")
    Iterable<ResourceType> findByHigherLevelId(@Param("id") int id);

}
