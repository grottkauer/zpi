package com.lending.repositories;

import com.lending.entities.ResourceRenting;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ResourceRentingRepository extends CrudRepository<ResourceRenting, Integer> {

    @Query("select rr2 from ResourceRenting rr2 inner join rr2.resource r \n" +
            " where rr2.orderDate = \n" +
            "(select max(rr3.orderDate) from ResourceRenting rr3 \n" +
            "inner join rr3.resource r where r.id =:id) \n" +
            "and r.id =:id")
    ResourceRenting getLatestRentingOfResource(@Param("id") int id);

}
