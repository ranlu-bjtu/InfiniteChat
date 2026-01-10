package com.bjtu.freeChat.ContactService.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bjtu.freeChat.ContactService.model.entity.Session;
import com.bjtu.freeChat.ContactService.model.dto.CreateGroupRequest;
import com.bjtu.freeChat.ContactService.model.dto.CreateGroupResponse;

public interface SessionService extends IService<Session> {
    CreateGroupResponse createGroup(CreateGroupRequest request);
}