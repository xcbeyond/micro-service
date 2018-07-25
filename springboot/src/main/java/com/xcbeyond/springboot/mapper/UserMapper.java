package com.xcbeyond.springboot.mapper;

import java.util.HashMap;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import com.xcbeyond.springboot.model.User;

/**
 * User数据访问层接口
 * @author xcbeyond
 * 2018年7月16日下午5:01:17
 */
public interface UserMapper {
	/**
	 * 通过userid查询
	 * @param userid
	 * @return
	 */
	public User queryUserByUserid(String userid);
	
	/**
	 * 通过userid更新username
	 * @param userid
	 * @param username
	 */
	public void updateByUserid(HashMap<String,String> map);
}
