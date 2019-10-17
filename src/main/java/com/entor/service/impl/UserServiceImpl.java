package com.entor.service.impl;

import com.entor.entity.User;
import com.entor.mapper.UserMapper;
import com.entor.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

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
		User user = userMapper.selectOne(new User(null,username,password));
		if (user!=null) {
			return user;
		}
		return null;
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
