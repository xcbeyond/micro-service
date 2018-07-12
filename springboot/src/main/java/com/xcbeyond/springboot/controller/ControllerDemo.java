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

//是@Controller和@ResponseBody的合集,表示这是个控制器bean,并且是将函数的返回值直接填入HTTP响应体中,是REST风格的控制器。
@RestController
//提供路由信息，负责URL到Controller中的具体函数的映射
@RequestMapping("/demo")
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
