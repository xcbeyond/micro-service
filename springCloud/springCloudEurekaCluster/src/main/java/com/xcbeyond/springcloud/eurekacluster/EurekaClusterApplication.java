package com.xcbeyond.springcloud.eurekacluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka集群启动类
 * @author xcbeyond
 * 2018年8月7日上午10:34:01
 */
@SpringBootApplication
//开启对EurekaServer的支持，即：作为Eureka服务端
@EnableEurekaServer
//开启作为Eureka Server的客户端的支持
@EnableDiscoveryClient
public class EurekaClusterApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaClusterApplication.class, args);
	}
}
