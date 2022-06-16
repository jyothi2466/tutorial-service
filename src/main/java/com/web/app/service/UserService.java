package com.web.app.service;

import com.web.app.domain.User;
import com.web.app.domain.UserEntity;

public interface UserService {

	public int createUser(User user);
	
	public UserEntity findUserEntityByuserId(String  userId);
	
	public UserEntity findUserEntityByage(int age);
}
