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

    @Query("select r from Resource r \n" +
            "join r.resourceType rt \n" +
            "where r.isDeleted = false and r.canBeBorrowed = true \n" +
            "and rt.id=:id \n" +
            "and ((select rr2.status from ResourceRenting rr2 \n" +
            "where rr2.orderDate = (select max(rr3.orderDate) from ResourceRenting rr3 where rr3.resource = r.id) \n" +
            "and rr2.resource = r.id) = com.lending.entities.RentingStatus.Oddane or \n" +
            "(select rr2.status from ResourceRenting rr2 \n" +
            "where rr2.orderDate = (select max(rr3.orderDate) from ResourceRenting rr3 where rr3.resource = r.id) \n" +
            "and rr2.resource = r.id) is null)")
    List<Resource> getAvailableResourcesWithCategory(@Param("id") int id);

    @Query("select r from Resource r \n" +
            "inner join r.resourceType t1 \n" +
            "left join t1.higherLevel t2 \n" +
            "left join t2.higherLevel t3 \n" +
            "left join t3.higherLevel t4 \n" +
            "where r.isDeleted = false and r.canBeBorrowed = true \n" +
            "and (t1.id=:id or t2.id=:id or t3.id=:id or t4.id=:id) \n" +
            "and ((select rr2.status from ResourceRenting rr2 \n" +
            "where rr2.orderDate = (select max(rr3.orderDate) from ResourceRenting rr3 where rr3.resource = r.id) \n" +
            "and rr2.resource = r.id) = com.lending.entities.RentingStatus.Oddane or \n" +
            "(select rr2.status from ResourceRenting rr2 \n" +
            "where rr2.orderDate = (select max(rr3.orderDate) from ResourceRenting rr3 where rr3.resource = r.id) \n" +
            "and rr2.resource = r.id) is null)")
    List<Resource> getAvailableResourcesWithHighestCategory(@Param("id") int id);

    @Query("select r from Resource r where r.isDeleted = false and r.canBeBorrowed = true \n" +
            "and ((select rr2.status from ResourceRenting rr2 \n" +
            "where rr2.orderDate = (select max(rr3.orderDate) from ResourceRenting rr3 where rr3.resource = r.id) \n" +
            "and rr2.resource = r.id) = com.lending.entities.RentingStatus.Oddane or \n" +
            "(select rr2.status from ResourceRenting rr2 \n" +
            "where rr2.orderDate = (select max(rr3.orderDate) from ResourceRenting rr3 where rr3.resource = r.id) \n" +
            "and rr2.resource = r.id) is null)")
    List<Resource> getAvailableResources();

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
