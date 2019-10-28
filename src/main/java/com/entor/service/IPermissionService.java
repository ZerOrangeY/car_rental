package com.entor.service;

import com.entor.entity.Permission;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Orange
 * @since 2019-10-16
 */
public interface IPermissionService extends IService<Permission> {
	List<Permission> getPermissionByRid(Integer rid);
}
