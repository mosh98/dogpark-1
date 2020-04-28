package com.pvt.dogpark.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pvt.dogpark.dao.UserDAO;

@Repository
public interface UserRepository extends CrudRepository<UserDAO, Integer> {
	
	UserDAO findByUsername(String username);
	
}