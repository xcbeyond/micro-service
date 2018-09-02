package com.xcbeyond.springcloud.provider.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xcbeyond.springcloud.provider.model.User;
import com.xcbeyond.springcloud.provider.service.ServiceDemo;

/**
 * 控制层,为其他服务提供对外API接口
 * @author xcbeyond
 * 2018年8月7日上午11:45:30
 */
@RestController
@RequestMapping("/demo")
public class ControllerDemo {
	
	@Resource
	public ServiceDemo serviceDemo;
	
	@RequestMapping("/getMsg")
	public String getMsg() {
		String result = serviceDemo.messageContext();
		return result;
	}
	
	@RequestMapping("/print")
	public String print() {
		return "Hello,SpringCloud!";
	}
	
	/**
	 * 插入用户信息
	 * @return
	 */
	@RequestMapping("/insertUser")
	public String insertUser() {
		int result = serviceDemo.insertUser();
		return String.valueOf(result);
		
	}
	
	/**
	 * 通过userid查询
	 * @param userid
	 * @return
	 */
	@RequestMapping(value="/queryUserByUserid", method=RequestMethod.GET)
	public String queryUserByUserid(@RequestParam("userid") String userid) {
		User user = serviceDemo.queryUserByUserid(userid);
		return user.toString();
		
	}
	
	/**
	 * 通过userid更新username
	 * @param userid
	 * @param username
	 */
	@RequestMapping(value="/updateByUserid", method=RequestMethod.GET)
	public String updateByUserid(@RequestParam("userid") String userid, @RequestParam("username") String username) {
		serviceDemo.updateByUserid(userid,username);
		return userid + "更新username成功!";
	}
}
