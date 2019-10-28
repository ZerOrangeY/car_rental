package com.entor.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.entor.entity.User;
import com.entor.mapper.UserMapper;
import com.entor.service.IUserService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Orange
 * @since 2019-10-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public User login(String username, String password) {
		Wrapper<User> wrapper = new EntityWrapper<>();
		wrapper.eq(User.USERNAME, username);
		wrapper.and();
		wrapper.eq(User.PASSWORD, password);
		List<User> list =userMapper.selectList(wrapper);
		if (list!=null&&!list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public User getUserByUsername(String username) {
		Wrapper<User> wrapper = new EntityWrapper<>();
		wrapper.eq(User.USERNAME, username);
		List<User> list =userMapper.selectList(wrapper);
		if (list!=null&&!list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}
	
}
