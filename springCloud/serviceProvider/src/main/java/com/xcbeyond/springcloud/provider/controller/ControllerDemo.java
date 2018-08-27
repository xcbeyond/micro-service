package com.xcbeyond.springcloud.provider.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
