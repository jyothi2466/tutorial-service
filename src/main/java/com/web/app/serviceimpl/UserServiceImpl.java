package com.web.app.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import com.web.app.daoimpl.UserDaoImpl;
import com.web.app.domain.User;
import com.web.app.domain.UserEntity;
import com.web.app.repository.UserEntityRepository;
import com.web.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDaoImpl userDaoImpl;
	@Autowired
	public UserEntityRepository userEntityRepository;

	@Override
	public int createUser(User user) {

		return userDaoImpl.create(user);

	}

	public UserEntity createUser1(UserEntity userEntity) {

		return userEntityRepository.save(userEntity);
	}

	@Override
	public UserEntity findUserEntityByuserId(String userId) {

		Optional<UserEntity> user = userEntityRepository.findById(userId);

		if (user.isPresent()) {
			return user.get();
		} else {
			throw new RuntimeException("User Data is not there");
		}

	}

	@Override
	public UserEntity findUserEntityByage(int age) {

		
		return null;
	}

}
