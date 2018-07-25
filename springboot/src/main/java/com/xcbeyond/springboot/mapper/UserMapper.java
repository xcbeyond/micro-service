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
//指定使用缓存名
@CacheConfig(cacheNames="userCache")
public interface UserMapper {
	/**
	 * 通过userid查询
	 * @param userid
	 * @return
	 */
	//@Cacheable:将查询结果缓存到redis中，（key="#p0"）指定传入的第一个参数作为redis的key
	@Cacheable(key="#p0")
	public User queryUserByUserid(String userid);
	
	/**
	 * 通过userid更新username
	 * @param userid
	 * @param username
	 */
	//@CachePut:指定key为第一个参数userid，将更新的结果同步到redis中
	@CachePut(key = "#p0")
	public void updateByUserid(HashMap<String,String> map);
}
