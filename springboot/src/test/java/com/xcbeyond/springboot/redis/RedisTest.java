package com.xcbeyond.springboot.redis;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 
 * @author xcbeyond
 * 2018年7月19日下午3:08:04
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisTest {
	@Resource
	private RedisUtils redisUtils;

	/**
	 * 插入缓存数据
	 */
	@Test
	public void set() {
		redisUtils.set("redis_key", "redis_vale");
	}
	
	/**
	 * 读取缓存数据
	 */
	@Test
	public void get() {
		String value = redisUtils.get("redis_key");
		System.out.println(value);
	}

}
