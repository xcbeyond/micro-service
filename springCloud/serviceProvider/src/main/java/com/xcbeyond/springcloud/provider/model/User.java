package com.xcbeyond.springcloud.provider.model;

import java.io.Serializable;
/**
 * User实体类
 * @author xcbeyond
 * 2018年7月12日上午11:50:36
 */
public class User implements Serializable{
	private static final long serialVersionUID = -8817105879576293812L;
	
	private String userId;
	private String userName;
	private String sex;
	private int age;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
}
