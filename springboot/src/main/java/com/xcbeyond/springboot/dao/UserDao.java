package com.xcbeyond.springboot.dao;

import com.xcbeyond.springboot.model.User;

public interface UserDao {
	/**
	 * 插入User
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
}
