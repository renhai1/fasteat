package com.sherry.fasteat.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sherry.fasteat.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}