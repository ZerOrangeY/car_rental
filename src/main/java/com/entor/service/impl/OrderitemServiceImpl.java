package com.entor.service.impl;

import com.entor.entity.Orderitem;
import com.entor.mapper.OrderitemMapper;
import com.entor.service.IOrderitemService;
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
public class OrderitemServiceImpl extends ServiceImpl<OrderitemMapper, Orderitem> implements IOrderitemService {
	
}
