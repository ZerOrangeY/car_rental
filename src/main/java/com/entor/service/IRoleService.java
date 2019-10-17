package com.entor.service;

import com.entor.entity.Role;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Orange
 * @since 2019-10-16
 */
public interface IRoleService extends IService<Role> {
	Role getRoleByUid(Integer uid);
}
