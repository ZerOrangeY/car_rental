package com.entor;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.entor.entity.Permission;
import com.entor.entity.Role;
import com.entor.entity.User;
import com.entor.service.IPermissionService;
import com.entor.service.IRoleService;
import com.entor.service.IUserService;

public class Test01 {
	
//	private static IUserService userService;
//	private static IRoleService roleService;
//	private static IPermissionService permissionService;
//	
//	
//	public static void testpower() {
//		String username = "admin";
//		//用户登录账号  (登录后才到达这个方法)
//		User user = userService.getUserByUsername(username);
//		//根据账号uid获取用户对象角色
//		Role role = roleService.getRoleByUid(user.getId());
//		//根据角色ID获取权限列表
//		List<Permission> plist = permissionService.getPermissionByRid(role.getId());
//		//把"权限对象"转换成"权限名称"集合
//		List<String> list = new ArrayList<>();
//		for (Permission p : plist) {
//			list.add(p.getName());
//		}
//		System.out.println(list);
//	}
//	public static void main(String[] args) {
//		testpower();
//	}
}
