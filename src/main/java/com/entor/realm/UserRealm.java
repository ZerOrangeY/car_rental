package com.entor.realm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entor.entity.Permission;
import com.entor.entity.Role;
import com.entor.entity.User;
import com.entor.mapper.UserMapper;
import com.entor.service.IPermissionService;
import com.entor.service.IRoleService;
import com.entor.service.IUserService;

public class UserRealm extends AuthorizingRealm {
	
	@Autowired
	private SessionDAO sessionDao;
	@Autowired
	private IUserService userService;
	@Autowired
	private IRoleService roleService;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private IPermissionService permissionService;

	
	

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {
		// 这里做权限控制
		//用户的登录账号
		System.out.println("===================进入权限控制====================");
		String username = pc.getPrimaryPrincipal().toString();
		System.out.println("用户名"+username);
		//用户登录账号  (登录后才到达这个方法)
		User user = userService.getUserByUsername(username);
		//根据账号uid获取用户对象角色
		Role role = roleService.getRoleByUid(user.getId());
		//根据角色ID获取权限列表
		List<Permission> plist = permissionService.getPermissionByRid(role.getId());
		//把"权限对象"转换成"权限名称"集合
		List<String> list = new ArrayList<>();
		for (Permission p : plist) {
			list.add(p.getName());
		}
		
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//添加角色名称
		info.addRole(role.getName());
		//添加权限名称
		info.addStringPermissions(list);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		System.out.println("================进入登录控制================");
		// 这里做登录控制
		UsernamePasswordToken t = (UsernamePasswordToken)token;
		//获取登录的用户名
		String username = t.getUsername();
		//获取登录的密码
		String password = new String(t.getPassword());
		//查询数据库 
		User user = userService.login(username, password);
		System.out.println(user);
		if (user==null||!user.getPassword().equals(password)) {
			throw new AuthenticationException();
		}
		//清除当前用户已存在服务器的登录会话,只允许一处登录
		//获取服务器当前所有的会话对象
		Collection<Session> sessions = sessionDao.getActiveSessions();
		for (Session session: sessions) {
			//会话中的用户名
			String sessionuser = String.valueOf(session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY));
			if (sessionuser.equals(username)) {
				session.setTimeout(0);
				break;
			}
		
		}
//		System.out.println("===================getUserByUsername测试====================");
//		Wrapper<User> wrapper = new EntityWrapper<>();
//		wrapper.eq(User.USERNAME, username);
//		List<User> list =userMapper.selectList(wrapper);
//		System.out.println(list);
//		System.out.println("===================getUserByUsername测试====================");
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username,password,getName());
		return info;
	}

}
