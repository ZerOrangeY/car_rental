package com.entor.web;


import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
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
		return "login";
	}
	@RequestMapping("/index")
	public String home(Model mod) {
		System.out.println("进入login");
		Subject subject = SecurityUtils.getSubject();
		String username = subject.getPrincipal().toString();
		mod.addAttribute("username",username);
		return "index";
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
			return "login";
		}
	}
	@RequestMapping("/add")
	@RequiresPermissions("sys_add")
	public String add(Map map) {
		System.out.println("进入sys_add");
		map.put("msg", "增加一条数据成功");
		return "test";
	}
	
	@RequestMapping("/delete")
	@RequiresPermissions("sys_delete")
	public String delete(Map map) {
		map.put("msg", "删除一条数据成功");
		return "test";
	}
	@RequestMapping("/update")
	@RequiresPermissions("sys_update")
	public String update(Map map) {
		map.put("msg", "修改一条数据成功");
		return "test";
	}
	@RequestMapping("/read")
	@RequiresPermissions("sys_read")
	public String read(Map map) {
		map.put("msg", "查询一条数据成功");
		return "test";
	}
	
	@RequestMapping("/query")
	@RequiresPermissions("query")
	public String query(Map map) {
		map.put("msg", "query一条数据成功");
		return "test";
	}
	
	
	
}
