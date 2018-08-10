package com.xcbeyond.springcloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xcbeyond.springcloud.consumer.service.ConsumerService;

/**
 * 
 * @author xcbeyond
 * 2018年8月10日上午10:48:29
 */
@RestController
@RequestMapping("/feignClient")
public class ConsumerController {

	@Autowired
	public ConsumerService consumerService;
	
	/**
	 * 通过Feign方式 远程调用其他服务的接口
	 * @return
	 */
	@RequestMapping("/getMsgByFeign")
	public String getMsgByFeign() {
		return "通过服务间远程调用 Feign方式获取：" + consumerService.getMsg(); 
	}
}
