package com.ssm.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.controller.MD5Utils;
import com.ssm.dao.UserDao;
import com.ssm.entity.User;
import com.ssm.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	public User login(Map<String, String> map) {
		// TODO Auto-generated method stub
		return userDao.login(map);
	}

	@Override
	public void regist(User user) {
		// TODO Auto-generated method stub
		MD5Utils md5=new MD5Utils();
		String password=md5.encode(user.getPassword());
		userDao.addUser(user.getTelephone(), password);
	}

}
