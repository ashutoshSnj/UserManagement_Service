package com.task.User_Management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.User_Management.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
   
	  Optional<User> findByEmail(String email);

	    boolean existsByEmail(String email);
}
