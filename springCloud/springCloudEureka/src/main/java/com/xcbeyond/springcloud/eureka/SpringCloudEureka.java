package com.xcbeyond.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka启动类
 * @author xcbeyond
 * 2018年8月3日上午9:40:48
 */
@SpringBootApplication
//开启对EurekaServer的支持，即：作为Eureka服务端
@EnableEurekaServer
public class SpringCloudEureka {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEureka.class, args);
	}
}
