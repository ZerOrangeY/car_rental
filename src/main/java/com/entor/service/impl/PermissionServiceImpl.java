package com.entor.service.impl;

import com.entor.entity.Permission;
import com.entor.mapper.PermissionMapper;
import com.entor.service.IPermissionService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {
	
	@Autowired
	private PermissionMapper permissionMapper;
	@Override
	public List<Permission> getPermissionByRid(Integer rid) {
		// TODO Auto-generated method stub
		return permissionMapper.getPermissionByRid(rid);
	}
	
}
