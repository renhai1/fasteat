package com.sherry.fasteat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sherry.fasteat.entity.ShoppingCart;
import com.sherry.fasteat.mapper.ShoppingCartMapper;
import com.sherry.fasteat.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
