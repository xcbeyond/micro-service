package com.xcbeyond.springcloud.provider.service.impl;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.xcbeyond.springcloud.provider.mapper.UserMapper;
import com.xcbeyond.springcloud.provider.model.User;
import com.xcbeyond.springcloud.provider.service.ServiceDemo;

@Service
//指定使用缓存名
@CacheConfig(cacheNames="userCache")
public class ServiceDemoImpl implements ServiceDemo {
	
	@Resource
	private UserMapper userMapper;

	@Override
	public String messageContext() {
		String str = "您好！我是服务提供者";
		return str;
	}

	@Override
	public int insertUser() {
		User user = new User();
		user.setUserId("xcbeyond");
		user.setUserName("xcbeyond");
		user.setSex("F");
		user.setAge(18);
		
		int result = userMapper.insertUser(user);
		
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
