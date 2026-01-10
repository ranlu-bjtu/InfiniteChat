package com.bjtu.freeChat.ContactService.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bjtu.freeChat.ContactService.mapper.UserMapper;
import com.bjtu.freeChat.ContactService.model.entity.User;
import com.bjtu.freeChat.ContactService.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

}