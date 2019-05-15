package com.lending.repositories;

import com.lending.dto.ResourceDetailsDto;
import com.lending.dto.ResourceRentingHistoryDto;
import com.lending.entities.Resource;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ResourceRepository extends CrudRepository<Resource, Integer> {

    @Query("select r from Resource r join r.resourceType rt where rt.id=:id")
    List<Resource> getResourcesWithCategory(@Param("id") int id);

    @Query("select r from Resource r join r.resourceType rt where rt.id=:id and r.canBeBorrowed = true \n" +
            "and r.isDeleted = false and (select rr2.status from ResourceRenting rr2 \n" +
            "where rr2.orderDate = (select max(rr3.orderDate) from ResourceRenting rr3 where rr3.resource = r.id) \n"
            +"and rr2.resource = r.id) <> com.lending.entities.RentingStatus.Utworzone and \n" +
            "(select rr2.status from ResourceRenting rr2 \n" +
            "where rr2.orderDate = (select max(rr3.orderDate) from ResourceRenting rr3 where rr3.resource = r.id) \n" +
            "and rr2.resource = r.id) <> com.lending.entities.RentingStatus.Zrealizowane")
    List<Resource> getAvailableResourcesWithCategory(@Param("id") int id);

    @Query("select max(rr.borrowDate) from ResourceRenting rr where rr.resource=:id")
    Date getLatestBorrowDate(@Param("id") int id);

    @Query("select new com.lending.dto.ResourceDetailsDto (r.id, r.name, r.points, rt.name,  \n" +
            "(select rr2.status from ResourceRenting rr2 where rr2.orderDate = \n" +
            "(select max(rr3.orderDate) from ResourceRenting rr3 where rr3.resource = r.id) \n" +
            "and rr2.resource = r.id), r.description, (select count(rr.id) from ResourceRenting rr where rr.resource = r.id)) \n" +
            "from Resource r \n" +
            "inner join r.resourceType rt \n" +
            "where r.id=:id \n")
    ResourceDetailsDto getProductDetails(@Param("id") int id);

    @Query("select new com.lending.dto.ResourceRentingHistoryDto (rr.borrowDate, u.email, rr.giveBackDate) \n" +
            "from Resource r \n" +
            "inner join r.rentings rr \n" +
            "inner join rr.recipent u \n" +
            "where r.id=:id")
    List<ResourceRentingHistoryDto> getProductRentingHistory(@Param("id") int id);



}
