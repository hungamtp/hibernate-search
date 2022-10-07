package com.example.hibernatesearch;

import com.example.hibernatesearch.entity.UserRoleType;
import com.example.hibernatesearch.entity.UserRoleTypePK;
import com.example.hibernatesearch.repo.UserRepository;
import com.example.hibernatesearch.repo.UserRoleTypeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateSearchApplicationTests {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRoleTypeRepository userRoleTypeRepository;

	@Test
	void contextLoads() {
        var user = userRepository.findById(2).get();
        var savedRole = userRoleTypeRepository.save(UserRoleType.builder()
                .user(user)
                .id(new UserRoleTypePK(1,1))
            .build());
        var users = userRepository.findAll();
	}

}
