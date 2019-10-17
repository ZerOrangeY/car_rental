package com.entor.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.entor.entity.Cars;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author Orange
 * @since 2019-10-16
 */
@Mapper
public interface CarsMapper extends BaseMapper<Cars> {

}