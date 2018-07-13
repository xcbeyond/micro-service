package com.xcbeyond.springboot.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xcbeyond.springboot.model.User;

class UserDaoJdbcTemplateImplTest {
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testInsertUser() {
		User user = new User();
		user.setUserId("xcbeyond");
		user.setUserName("xcbeyond");
		user.setSex("F");
		user.setAge(18);
		
		userDao.insertUser(user);
	}

}
