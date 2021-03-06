package com.postsapp.springboot.repositories;

import com.postsapp.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByName(String name);
}
