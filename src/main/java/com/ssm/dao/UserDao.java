package com.ssm.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.User;

public interface UserDao {


	/**
	 * 登录
	 * 
	 * @param map
	 * @return
	 */
	public User login(Map<String, String> map);
	
	public void addUser(@Param("telephone")String telephone,
			@Param("password")String password);
	
}
