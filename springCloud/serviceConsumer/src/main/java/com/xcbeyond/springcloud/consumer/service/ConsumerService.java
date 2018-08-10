package com.xcbeyond.springcloud.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 通过在本服务的service层直接调用其他服务的api层的API接口进行相关操作。</br>
 * service-provider是一个服务提供者。
 * @author xcbeyond
 * 2018年8月10日上午10:44:48
 */
//调用的微服务接口所在的服务名
@FeignClient("service-provider")
public interface ConsumerService {
	
	@GetMapping("/demo/getMsg")
	public String getMsg();
	
}
