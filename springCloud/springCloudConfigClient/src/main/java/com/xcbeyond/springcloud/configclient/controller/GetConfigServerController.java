package com.xcbeyond.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 从服务配置中心获取配置信息
 * @author xcbeyond
 * 2018年8月7日下午4:11:00
 */
@RestController
public class GetConfigServerController {
	//通过服务配置中心获取git上配置文件里的key
	@Value("${test}")
	private String test;
	
	@RequestMapping("/hi")
	public String hi() {
		return test;
	}
}
