package com.xcbeyond.springboot.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xcbeyond.springboot.config.RandomConfig;
/**
 * Controller demo
 * @author xcbeyond
 * 2018年7月5日下午11:22:49
 */

@RestController
public class ControllerDemo {
	@Resource
	private RandomConfig randomConfig;

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
		return randomConfig.getSecret();
	}
}
