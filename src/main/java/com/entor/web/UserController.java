package com.entor.web;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.entity.User;
import com.entor.service.IUserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Orange
 * @since 2019-10-16
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userSerive;
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("进入login");
		return "/login";
	}
	@RequestMapping("/index")
	public String home(Model mod) {
		System.out.println("进入login");
		Subject subject = SecurityUtils.getSubject();
		String username = subject.getPrincipal().toString();
		mod.addAttribute("username",username);
		return "/index";
	}
	@RequestMapping("/loginCheck")
	public String loginCheck(User user,Model mod) {
		System.out.println("进入loginCheck");
		UsernamePasswordToken token =new UsernamePasswordToken(user.getUsername(),user.getPassword());
		Subject subject = SecurityUtils.getSubject();
		try {
			subject.login(token);
			return "redirect:/user/index";
		} catch (Exception e) {
			mod.addAttribute("msg", "账号或者密码错误");
			return "/login";
		}
	}
	
	
	
	
	
	
	
	
}
