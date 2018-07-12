package com.xcbeyond.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * SpringBoot启动类
 * @author xcbeyond
 * 2018年7月2日下午5:41:45
 */
@SpringBootApplication
public class SpringbootApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);
	
	public static void main(String[] args) {
		if(logger.isDebugEnabled()) {
			logger.debug("SpringBoot starting...");
		}
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
