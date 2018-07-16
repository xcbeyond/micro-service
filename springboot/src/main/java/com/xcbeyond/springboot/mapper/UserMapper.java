package com.xcbeyond.springboot.mapper;

import com.xcbeyond.springboot.model.User;

/**
 * User数据访问层接口
 * @author xcbeyond
 * 2018年7月16日下午5:01:17
 */
public interface UserMapper {
	/**
	 * 通过userid查询
	 * @param userid
	 * @return
	 */
	public User queryUserByUserid(String userid);
}
