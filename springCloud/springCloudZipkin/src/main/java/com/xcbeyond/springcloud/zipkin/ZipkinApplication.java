package com.xcbeyond.springcloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 服务调用链监控。
 * @author xcbeyond
 * 2018年8月29日上午11:24:19
 */
@SpringBootApplication
@EnableZipkinStreamServer
@EnableAsync
@EnableEurekaClient
public class ZipkinApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
	}
}

