package com.xcbeyond.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 随机数配置类
 * @author xcbeyond
 * 2018年7月11日下午3:04:12
 */
//@Component
//绑定属性文件中的属性，prefix:属性前缀
//@ConfigurationProperties(prefix="user.random")
//加载指定的属性配置文件，获取对应的key-value值，存储到Spring的Environment中
//@PropertySource(value="config/random.properties")
public class RandomConfig {
	private String secret;
    private int intNumber;
    private int lessTen;
    private int range;
    private long longNumber;
    private String uuid;
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public int getIntNumber() {
		return intNumber;
	}
	public void setIntNumber(int intNumber) {
		this.intNumber = intNumber;
	}
	public int getLessTen() {
		return lessTen;
	}
	public void setLessTen(int lessTen) {
		this.lessTen = lessTen;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public long getLongNumber() {
		return longNumber;
	}
	public void setLongNumber(long longNumber) {
		this.longNumber = longNumber;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
