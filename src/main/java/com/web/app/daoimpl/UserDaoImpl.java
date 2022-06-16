package com.web.app.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.web.app.dao.UserDao;
import com.web.app.domain.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public int create(User user) {

		String query = "INSERT INTO USER_SCHEMA.USER VALUES ('" + user.getUserId() + "','" + user.getFirstName() + "','"
				+ user.getLastName() + "'," + "'" + user.getMiddleName() + "'," + user.getAge() + ")";

		return jdbcTemplate.update(query);

	}

}
