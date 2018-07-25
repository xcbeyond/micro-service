package com.xcbeyond.springboot.service.impl;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.xcbeyond.springboot.dao.UserDao;
import com.xcbeyond.springboot.mapper.UserMapper;
import com.xcbeyond.springboot.model.User;
import com.xcbeyond.springboot.service.DemoService;
/**
 * 
 * @author xcbeyond
 * 2018年7月25日下午5:35:13
 */
@Service
//指定使用缓存名
@CacheConfig(cacheNames="userCache")
public class DemoServiceImpl implements DemoService {
	
	@Resource
	private UserDao userDao;
	
	@Resource
	private UserMapper userMapper;

	@Override
	public int insertUserByJdbcTemplate() {
		User user = new User();
		user.setUserId("xcbeyond");
		user.setUserName("xcbeyond");
		user.setSex("F");
		user.setAge(18);
		
		int result = userDao.insertUser(user);
		
		return result;
	}

	@Override
	//@Cacheable:将查询结果缓存到redis中，（key="#p0"）指定传入的第一个参数作为redis的key
	@Cacheable(key="#p0")
	public User queryUserByUserid(String userid) {
		return userMapper.queryUserByUserid(userid);
	}

	@Override
	//@CachePut:指定key为第一个参数userid，将更新的结果同步到redis中
	@CachePut(key = "#p0")
	public void updateByUserid(String userid, String username) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("userid", userid);
		map.put("username", username);
		userMapper.updateByUserid(map);
	}
}
