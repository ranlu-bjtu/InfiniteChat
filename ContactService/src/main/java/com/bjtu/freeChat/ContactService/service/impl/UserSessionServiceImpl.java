package com.bjtu.freeChat.ContactService.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bjtu.freeChat.ContactService.mapper.UserSessionMapper;
import com.bjtu.freeChat.ContactService.model.entity.UserSession;
import com.bjtu.freeChat.ContactService.service.UserSessionService;
import org.springframework.stereotype.Service;

@Service
public class UserSessionServiceImpl extends ServiceImpl<UserSessionMapper, UserSession> implements UserSessionService {

}