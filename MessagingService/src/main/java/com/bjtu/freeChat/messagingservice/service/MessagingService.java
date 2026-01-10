package com.bjtu.freeChat.messagingservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bjtu.freeChat.messagingservice.model.dto.SendMsgRequest;
import com.bjtu.freeChat.messagingservice.model.entity.Message;
import com.bjtu.freeChat.messagingservice.model.vo.ResponseMsgVo;
import org.springframework.stereotype.Service;

@Service
public interface MessagingService extends IService<Message> {

    ResponseMsgVo sendMessage(SendMsgRequest sendMsgRequest) throws Exception;
}