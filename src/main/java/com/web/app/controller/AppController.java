package com.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.app.domain.User;
import com.web.app.domain.UserEntity;
import com.web.app.serviceimpl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class AppController {

	@Autowired
	public UserServiceImpl userServiceImpl;

	@PostMapping("/create")
	public int createuser(@RequestBody User user) {
		System.out.println("User details---> " + user);
		// logger.info("user-> " + user);

		return userServiceImpl.createUser(user);

	}

	@PostMapping("/createJPA")
	public UserEntity createuser(@RequestBody UserEntity userEntity) {
		return userServiceImpl.createUser1(userEntity);

	}

	@GetMapping("/findById/{userId}")
	public UserEntity findById(@PathVariable String userId) {
		return userServiceImpl.findUserEntityByuserId(userId);

	}

}
