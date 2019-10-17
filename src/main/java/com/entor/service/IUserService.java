package com.entor.service;

import com.entor.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Orange
 * @since 2019-10-16
 */
public interface IUserService extends IService<User> {
	User login(String username,String password);
	User getUserByUsername(String username);
}
