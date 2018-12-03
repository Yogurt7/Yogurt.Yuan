package com.ssm.service;

import java.util.Map;

import com.ssm.entity.User;

public interface UserService {


	/**
	 * 登录
	 * 
	 * @param map
	 * @return
	 */
	public User login(Map<String, String> map);
	
	public void regist(User user);

}