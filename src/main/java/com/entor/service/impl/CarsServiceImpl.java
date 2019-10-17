package com.entor.service.impl;

import com.entor.entity.Cars;
import com.entor.mapper.CarsMapper;
import com.entor.service.ICarsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
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
public class CarsServiceImpl extends ServiceImpl<CarsMapper, Cars> implements ICarsService {
	
}
