package com.university.management.repository;

import com.university.management.entity.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{

	User findByEmail(String email);
	

}
