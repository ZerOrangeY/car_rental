package com.entor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.entor.entity.Role;
import com.entor.mapper.RoleMapper;
import com.entor.mapper.UserMapper;
import com.entor.service.IRoleService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Orange
 * @since 2019-10-16
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
	@Autowired
	private RoleMapper roleMapper;
	@Override
	public Role getRoleByUid(Integer uid) {
		
		return roleMapper.getRoleByUid(uid);
	}
	
}
