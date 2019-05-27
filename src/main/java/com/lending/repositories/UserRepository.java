package com.lending.repositories;

import com.lending.dto.UserInfoDto;
import com.lending.dto.UsersProductDto;
import com.lending.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<Person, Integer>, UserRepositoryCustom {

    @Query("select u from Person u where u.email=:email")
    Person findByEmail(@Param("email") String email);

    @Query("select u from Person u where u.id=:id")
    Person getUserById(@Param("id") int id);

    @Query("select new com.lending.dto.UserInfoDto (u.firstName, u.lastName, \n" +
            "u.email, u.birthDate, a.zipCode, a.locality, a.street, a.nrHouse, a.nrFlat) from Person u \n" +
            "inner join u.address a \n" +
            "where u.id=:id")
    UserInfoDto getUserInfoById(@Param("id") int id);

    @Query("select case when count(u) > 0 then true else false end from Person u where u.email=:email")
    boolean checkIfUserExists(@Param("email") String email);

    @Query("select case when u.password=:password then true else false end from Person u where u.email=:email")
    boolean checkIfCredentialsAreCorrect(@Param("email") String email, @Param("password") String password);

    @Query("select u.id from Person u where u.email=:email")
    int getUserIdByEmail(@Param("email") String email);

    @Query("select new com.lending.dto.UsersProductDto (r.id, r.name, \n" +
            "CONCAT(case when hl3.name is not null then concat(hl3.name,' -  ') else '' end, \n" +
            "case when hl2.name is not null then concat(hl2.name,' - ') else '' end, \n" +
            "case when hl1.name is not null then concat(hl1.name,' - ') else '' end, \n" +
            "rt.name), r.addDate, \n" +
            "(select rr2.status from ResourceRenting rr2 where rr2.orderDate = \n" +
            "(select max(rr3.orderDate) from ResourceRenting rr3 where rr3.resource = r.id) \n" +
            "and rr2.resource = r.id), r.canBeBorrowed) \n" +
            "from Person u \n" +
            "inner join u.owningResources r \n" +
            "inner join r.resourceType rt \n" +
            "left join rt.higherLevel hl1 \n" +
            "left join hl1.higherLevel hl2 \n" +
            "left join hl2.higherLevel hl3 \n" +
            "where u.id=:id \n" +
            "and r.isDeleted = false \n")
    List<UsersProductDto> getUsersProducts(@Param("id") int id);

    @Query("select new com.lending.dto.UsersProductDto (r.id, r.name, \n" +
            "CONCAT(case when hl3.name is not null then concat(hl3.name,' -  ') else '' end, \n" +
            "case when hl2.name is not null then concat(hl2.name,' - ') else '' end, \n" +
            "case when hl1.name is not null then concat(hl1.name,' - ') else '' end, \n" +
            "rt.name), r.addDate) \n" +
            "from Person u \n" +
            "inner join u.owningResources r \n" +
            "inner join r.resourceType rt \n" +
            "left join rt.higherLevel hl1 \n" +
            "left join hl1.higherLevel hl2 \n" +
            "left join hl2.higherLevel hl3 \n" +
            "where r.isDeleted = true \n" +
            "and u.id=:id \n")
    List<UsersProductDto> getArchiveUsersProducts(@Param("id") int id);

    @Query("select u.firstName from Person u where u.id =:id")
    String getUserFirstName(@Param("id") int id);


}
