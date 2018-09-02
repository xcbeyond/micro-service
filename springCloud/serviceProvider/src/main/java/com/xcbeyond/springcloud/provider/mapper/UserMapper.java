package com.xcbeyond.springcloud.provider.mapper;

import java.util.HashMap;

import com.xcbeyond.springcloud.provider.model.User;

/**
 * User数据访问层接口
 * @author xcbeyond
 * 2018年7月16日下午5:01:17
 */
public interface UserMapper {
	/**
	 * 插入用户信息
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	/**
	 * 通过userid查询
	 * @param userid
	 * @return
	 */
	public User queryUserByUserid(String userid);
	
	/**
	 * 通过userid更新username
	 * @param userid
	 * @param username
	 */
	public void updateByUserid(HashMap<String,String> map);
}
