package com.xcbeyond.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @author xcbeyond
 * 2018年8月6日上午11:27:11
 */
@SpringBootApplication
//开启作为Eureka Server的客户端的支持
@EnableEurekaClient
//开启配置服务器的支持
@EnableConfigServer
public class ConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
