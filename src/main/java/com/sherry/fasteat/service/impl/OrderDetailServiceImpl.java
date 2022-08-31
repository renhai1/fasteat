package com.sherry.fasteat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sherry.fasteat.entity.OrderDetail;
import com.sherry.fasteat.mapper.OrderDetailMapper;
import com.sherry.fasteat.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}