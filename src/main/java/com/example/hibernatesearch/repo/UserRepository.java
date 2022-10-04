package com.example.hibernatesearch.repo;

import com.example.hibernatesearch.entity.AUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AUser, Integer> {

//    @Query("select from AUser u LEFT JOIN UserRoleType urt ON  urt.id.userId = u.id " +
//        "JOIN Role r ON urt.id.roleId =  ")
}
