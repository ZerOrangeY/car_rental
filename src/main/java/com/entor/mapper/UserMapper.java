package com.entor.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.entor.entity.User;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author Orange
 * @since 2019-10-16
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}