package com.xcbeyond.springboot.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xcbeyond.springboot.SpringbootApplication;
import com.xcbeyond.springboot.model.User;

//运行器，让测试运行于Spring测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//SpringBoot单元测试注解，classes属性指定启动类
@SpringBootTest(classes=SpringbootApplication.class)
public class UserDaoJdbcTemplateImplTest {
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
