package com.sherry.fasteat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sherry.fasteat.entity.User;
import com.sherry.fasteat.mapper.UserMapper;
import com.sherry.fasteat.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}
