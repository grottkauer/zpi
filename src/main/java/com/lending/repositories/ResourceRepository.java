package com.lending.repositories;

import com.lending.dto.BorrowingUserInfoDto;
import com.lending.dto.ResourceDetailsDto;
import com.lending.dto.ResourceRentingHistoryDto;
import com.lending.dto.UsersProductDto;
import com.lending.entities.Resource;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Blob;
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

    @Query("select r from Resource r \n" +
            "inner join r.resourceType t1 \n" +
            "left join t1.higherLevel t2 \n" +
            "left join t2.higherLevel t3 \n" +
            "left join t3.higherLevel t4 \n" +
            "where r.isDeleted = false and r.canBeBorrowed = true \n" +
            "and (t1.id=:catId or t2.id=:catId or t3.id=:catId or t4.id=:catId) \n" +
            "and ((select rr2.status from ResourceRenting rr2 \n" +
            "where rr2.orderDate = (select max(rr3.orderDate) from ResourceRenting rr3 where rr3.resource = r.id) \n" +
            "and rr2.resource = r.id) = com.lending.entities.RentingStatus.Oddane or \n" +
            "(select rr2.status from ResourceRenting rr2 \n" +
            "where rr2.orderDate = (select max(rr3.orderDate) from ResourceRenting rr3 where rr3.resource = r.id) \n" +
            "and rr2.resource = r.id) is null) and r.owner.id <>:userId")
    List<Resource> getAvailableResourcesHighestCatNotUser(@Param("catId") int catId, @Param("userId") int userId);

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

    @Query("select new com.lending.dto.ResourceDetailsDto (r.id, r.name, r.points, \n" +
           "CONCAT(case when hl3.name is not null then concat(hl3.name,' -  ') else '' end,\n" +
            "case when hl2.name is not null then concat(hl2.name,' - ') else '' end, \n" +
            "case when hl1.name is not null then concat(hl1.name,' - ') else '' end, \n" +
            "rt.name), \n" +
            "(select rr2.status from ResourceRenting rr2 where rr2.orderDate = \n" +
            "(select max(rr3.orderDate) from ResourceRenting rr3 where rr3.resource = r.id) \n" +
            "and rr2.resource = r.id), r.description, (select count(rr.id) from ResourceRenting rr where rr.resource = r.id)) \n" +
            "from Resource r \n" +
            "inner join r.resourceType rt \n" +
            "left join rt.higherLevel hl1 \n" +
            "left join hl1.higherLevel hl2 \n" +
            "left join hl2.higherLevel hl3 \n" +
            "where r.id=:id \n")
    ResourceDetailsDto getProductDetails(@Param("id") int id);

    @Query("select new com.lending.dto.ResourceRentingHistoryDto (rr.borrowDate, u.email, rr.giveBackDate) \n" +
            "from Resource r \n" +
            "inner join r.rentings rr \n" +
            "inner join rr.recipent u \n" +
            "where r.id=:id")
    List<ResourceRentingHistoryDto> getProductRentingHistory(@Param("id") int id);

    @Query("select new com.lending.dto.UsersProductDto (r.id, r.name, \n" +
            "CONCAT(case when hl3.name is not null then concat(hl3.name,' -  ') else '' end,\n" +
            "case when hl2.name is not null then concat(hl2.name,' - ') else '' end, \n" +
            "case when hl1.name is not null then concat(hl1.name,' - ') else '' end, \n" +
            "rt.name), \n" +
            "rr.borrowDate, (select rr2.status from ResourceRenting rr2 where rr2.orderDate = \n" +
            "(select max(rr3.orderDate) from ResourceRenting rr3 where rr3.resource = r.id) \n" +
            "and rr2.resource = r.id)) \n" +
            "from Resource r \n" +
            "inner join r.rentings rr \n" +
            "inner join r.resourceType rt \n" +
            "inner join rr.recipent u \n" +
            "left join rt.higherLevel hl1 \n" +
            "left join hl1.higherLevel hl2 \n" +
            "left join hl2.higherLevel hl3 \n" +
            "where u.id=:id \n" +
            "and rr.status <> com.lending.entities.RentingStatus.Oddane")
    List<UsersProductDto> getProductsBorrowedByUser(@Param("id") int id);

    @Query("select new com.lending.dto.UsersProductDto (r.id, r.name, \n" +
            "CONCAT(case when hl3.name is not null then concat(hl3.name,' -  ') else '' end, \n" +
            "case when hl2.name is not null then concat(hl2.name,' - ') else '' end, \n" +
            "case when hl1.name is not null then concat(hl1.name,' - ') else '' end, \n" +
            "rt.name), \n" +
            "rr.giveBackDate) \n" +
            "from Resource r \n" +
            "inner join r.rentings rr \n" +
            "inner join r.resourceType rt \n" +
            "inner join rr.recipent u \n" +
            "left join rt.higherLevel hl1 \n" +
            "left join hl1.higherLevel hl2 \n" +
            "left join hl2.higherLevel hl3 \n" +
            "where u.id=:id \n" +
            "and rr.status = com.lending.entities.RentingStatus.Oddane")
    List<UsersProductDto> getArchiveProductsBorrowedByUser(@Param("id") int id);

    @Query("select new com.lending.dto.BorrowingUserInfoDto(u.firstName, u.lastName, \n" +
            "u.email, a.locality) \n" +
        "from Resource r \n" +
        "inner join r.owner u \n" +
        "inner join u.address a \n" +
        "where r.id=:prodID")
    BorrowingUserInfoDto getGivingUserInfo(@Param("prodID") int prodID);

    //@Query("select case when r.image is null then false else true end from Resource r where r.id=:id")
    @Query("select case when count(i.id) = 0 then false else true end \n" +
            "from Resource r inner join r.images i where r.id=:id")
    boolean checkIfHasPhoto(@Param("id") int id);

    @Query("select i.content from Resource r inner join r.images i where r.id=:id")
    List<Blob> getPhotosOfResource(@Param("id") int id);

    @Query("select r from Resource r where r.id=:id")
    Resource getResourceById(@Param("id") int id);

    @Query("select r from Resource r where r.id in (:ids)")
    List<Resource> getResourcesByIds(@Param("ids") Integer[] ids);

    @Query("select u.id from Resource r inner join r.owner u where r.id =:id")
    int getOwnerOfResource(@Param("id") int id);

    @Query("select r.points from Resource r where r.id=:id")
    int getPriceOfResource(@Param("id") int id);
}
