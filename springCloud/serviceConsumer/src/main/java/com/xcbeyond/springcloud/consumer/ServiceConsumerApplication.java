package com.xcbeyond.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务消费者启动类
 * @author xcbeyond
 * 2018年8月3日下午4:33:18
 */
@SpringBootApplication
//开启作为Eureka Server的客户端的支持
@EnableEurekaClient
//开启feign的扫描
@EnableFeignClients
public class ServiceConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumerApplication.class, args);
	}
}
