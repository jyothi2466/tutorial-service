package com.web.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.app.domain.UserEntity;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, String> {

	public UserEntity findUserEntityByuserId(String userId);

//	public UserEntity findByFirstName(String firstName);

	public UserEntity findUserEntityByage(int age);
}
