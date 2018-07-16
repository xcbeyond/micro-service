package com.xcbeyond.springboot.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xcbeyond.springboot.dao.UserDao;
import com.xcbeyond.springboot.model.User;
/**
 * JdbcTemplate方式完成对t_user表的操作
 * @author xcbeyond
 * 2018年7月12日上午11:53:44
 */
//作用于持久层.用来表明该类是用来执行与数据库相关的操作（即dao对象），并支持自动处理数据库操作产生的异常
@Repository
public class UserDaoJdbcTemplateImpl implements UserDao {
	
	//自动导入依赖的bean
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public int insertUser(User user) {
		String sql = "INSERT INTO t_user (userid, username, sex, age) VALUES (:userid, :username, :sex, :age)";
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("userid", user.getUserId());
		param.put("username", user.getUserName());
		param.put("sex", user.getSex());
		param.put("age", user.getAge());
		
		return jdbcTemplate.update(sql, param);
	}

}
