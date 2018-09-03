package com.xcbeyond.springcloud.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;	

/**
 * 服务提供者启动类
 * @author xcbeyond
 * 2018年8月3日下午4:31:38
 */
@SpringBootApplication
//开启作为Eureka Server的客户端的支持
@EnableEurekaClient
//指定要扫描的Mapper类的包的路径
@MapperScan("com.xcbeyond.springcloud.provider.mapper")
public class ServiceProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderApplication.class, args);
	}
}
