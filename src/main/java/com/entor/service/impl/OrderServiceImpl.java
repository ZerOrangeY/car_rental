package com.entor.service.impl;

import com.entor.entity.Order;
import com.entor.mapper.OrderMapper;
import com.entor.service.IOrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {
	
}
