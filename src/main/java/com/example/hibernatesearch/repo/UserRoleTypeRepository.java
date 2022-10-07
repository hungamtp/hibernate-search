package com.example.hibernatesearch.repo;

import com.example.hibernatesearch.entity.UserRoleType;
import com.example.hibernatesearch.entity.UserRoleTypePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleTypeRepository extends JpaRepository<UserRoleType, UserRoleTypePK> {
}
