 package com.xcbeyond.springcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.xcbeyond.springcloud.gateway.filter.PreZuulFilter;

/**
 * zuul网关
 * @author xuchao
 * 2018年8月10日上午11:48:47
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	
	/**
	 * 开启过滤器
	 * @return
	 */
	@Bean
	public PreZuulFilter preZuulFilter() {
		return new PreZuulFilter();
	}
}
