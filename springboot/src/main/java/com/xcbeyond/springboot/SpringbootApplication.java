package com.xcbeyond.springboot;

import org.mybatis.spring.annotation.MapperScan;
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
//指定要扫描的Mapper类的包的路径
@MapperScan("com.xcbeyond.springboot.mapper")
public class SpringbootApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);
	
	public static void main(String[] args) {
		if(logger.isDebugEnabled()) {
			logger.debug("SpringBoot starting...");
		}
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
