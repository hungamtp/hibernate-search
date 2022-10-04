package com.example.hibernatesearch;

import com.example.hibernatesearch.repo.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateSearchApplicationTests {
    @Autowired
    private UserRepository userRepository;

	@Test
	void contextLoads() {
        var users = userRepository.findAll();
	}

}
