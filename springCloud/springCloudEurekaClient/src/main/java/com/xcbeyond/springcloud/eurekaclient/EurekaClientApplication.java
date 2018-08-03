package com.xcbeyond.springcloud.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Eureka Client（服务提供者）启动类
 * @author xcbeyond
 * 2018年8月3日下午3:05:44
 */
@SpringBootApplication
//开启作为Eureka Server的客户端的支持
@EnableEurekaClient
public class EurekaClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
