package com.SpringSecurity.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringSecurity.config.dto.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer>{
	
	
}
