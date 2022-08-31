package com.sherry.fasteat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sherry.fasteat.entity.DishFlavor;
import com.sherry.fasteat.mapper.DishFlavorMapper;
import com.sherry.fasteat.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}
