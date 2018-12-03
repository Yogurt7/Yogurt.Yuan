package com.ssm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.entity.User;
import com.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;

	/**
	 * 用户登录
	 * 
	 * @param req
	 * @param mv
	 * @return
	 */
	@RequestMapping("/login")
	public String login(HttpServletRequest req, Model model) {
		MD5Utils md5=new MD5Utils();
		String password=md5.encode(req.getParameter("password"));
		Map<String, String> map = new HashMap<String, String>();
		map.put("telephone", req.getParameter("telephone"));
		map.put("password", password);
		User user = userService.login(map);
		if (user != null) {// 登录成功进入消息页面
			return "redirect: /info/queryAll";
		} else {// 登录失败回到登录页面
			model.addAttribute("message", "用户名或密码输入错误,请重新输入");
			return "login";
		}

	}

	@RequestMapping("/goRegister")
	public String goRegister() {
		return "register";
	}
	
	@RequestMapping("/register")
	public String regist(User user) {
		userService.regist(user);
		return "login";
	}
	


}
