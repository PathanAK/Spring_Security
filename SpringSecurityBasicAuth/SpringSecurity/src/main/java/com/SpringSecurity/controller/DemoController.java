package com.SpringSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringSecurity.Repository.UserRepository;
import com.SpringSecurity.config.dto.Users;

@RestController
public class DemoController {
	
	@Autowired
	UserRepository repo;
	
	@Autowired
	PasswordEncoder encoder;
	
	@PostMapping("/signin")
	public Users addUser(@RequestBody Users ur) {
		ur.setPassword(encoder.encode(ur.getPassword()));
		return repo.save(ur);
	}
}
