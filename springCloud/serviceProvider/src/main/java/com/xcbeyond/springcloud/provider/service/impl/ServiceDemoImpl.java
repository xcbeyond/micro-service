package com.xcbeyond.springcloud.provider.service.impl;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.xcbeyond.springcloud.provider.mapper.UserMapper;
import com.xcbeyond.springcloud.provider.model.User;
import com.xcbeyond.springcloud.provider.service.ServiceDemo;
import com.xcbeyond.springcloud.provider.utils.RedisUtils;

@Service
public class ServiceDemoImpl implements ServiceDemo {
	
	@Resource
	RedisUtils redisUtils;
	
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

		redisUtils.set("xcbeyond", JSONObject.toJSONString(user));
		
		return result;
	}

	@Override
	public User queryUserByUserid(String userid) {
		User user = userMapper.queryUserByUserid(userid);
		if(null != user) {
			redisUtils.getAndSet(userid, JSONObject.toJSONString(user));
		}
		
		return user;
	}

	@Override
	public void updateByUserid(String userid, String username) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("userid", userid);
		map.put("username", username);
		userMapper.updateByUserid(map);
		
		//将修改后的数据更新到redis中
		User user = userMapper.queryUserByUserid(userid);
		if(null != user) {
			redisUtils.getAndSet(userid, JSONObject.toJSONString(user));
		}
	}

}
