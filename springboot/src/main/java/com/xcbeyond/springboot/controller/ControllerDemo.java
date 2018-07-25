package com.xcbeyond.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xcbeyond.springboot.config.RandomConfig;
import com.xcbeyond.springboot.dao.UserDao;
import com.xcbeyond.springboot.mapper.UserMapper;
import com.xcbeyond.springboot.model.User;
/**
 * Controller demo
 * @author xcbeyond
 * 2018年7月5日下午11:22:49
 */

//是@Controller和@ResponseBody的合集,表示这是个控制器bean,并且是将函数的返回值直接填入HTTP响应体中,是REST风格的控制器。
@RestController
//提供路由信息，负责URL到Controller中的具体函数的映射
@RequestMapping("/demo")
public class ControllerDemo {
//	@Resource
//	private RandomConfig randomConfig;
	
	@Resource
	private UserDao userDao;
	
	@Resource
	private UserMapper userMapper;

	@RequestMapping("/print")
	public String print() {
		return "hello SpringBoot!";
	}
	
	/**
	 * 随机32位MD5字符串
	 * @return
	 */
	@RequestMapping("/randomSecret")
	public String randomSecret() {
//		return randomConfig.getSecret();
		return null;
	}
	
	/**
	 * 通过JdbcTemplate方式插入用户信息
	 * @return
	 */
	@RequestMapping("/insertUserByJdbcTemplate")
	public String insertUserByJdbcTemplate() {
		User user = new User();
		user.setUserId("xcbeyond");
		user.setUserName("xcbeyond");
		user.setSex("F");
		user.setAge(18);
		
		int ret = userDao.insertUser(user);
		return String.valueOf(ret);
		
	}
	
	/**
	 * 通过userid查询
	 * @param userid
	 * @return
	 */
	@RequestMapping(value="/queryUserByUserid", method=RequestMethod.GET)
	public String queryUserByUserid(@RequestParam("userid") String userid) {
		User user = userMapper.queryUserByUserid(userid);
		return user.toString();
		
	}
	
	/**
	 * 通过userid更新username
	 * @param userid
	 * @param username
	 */
	@RequestMapping(value="/updateByUserid", method=RequestMethod.GET)
	public String updateByUserid(@RequestParam("userid") String userid, @RequestParam("username") String username) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("userid", userid);
		map.put("username", username);
		userMapper.updateByUserid(map);
		return username;
	}
}
