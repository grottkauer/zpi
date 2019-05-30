package com.lending.repositories;

import com.lending.entities.Address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {


    @Query("select a from Person u inner join u.address a where u.id=:id")
    Address getAddressesByUserId(@Param("id") int id);

    @Query("select case when count(a) > 0 then true else false end \n" +
            "from Address a where a.locality =:locality \n" +
            "and a.street =:street and a.nrHouse =:nrHouse and a.zipCode =:zipCode")
    boolean checkIfExists(@Param("locality") String locality,
                          @Param("street") String street,
                          @Param("nrHouse") String nrHourse,
                          @Param("zipCode") String zipCode);


}
