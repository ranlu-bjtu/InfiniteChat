package com.bjtu.freeChat.realtimeCommunicationService.controller;

import com.bjtu.freeChat.realtimeCommunicationService.common.Result;
import com.bjtu.freeChat.realtimeCommunicationService.common.ResultGenerator;
import com.bjtu.freeChat.realtimeCommunicationService.module.entity.Message;
import com.bjtu.freeChat.realtimeCommunicationService.service.NettyMessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/message/user")
@Slf4j
@RequiredArgsConstructor
public class RcvMsgController {
    private final NettyMessageService nettyMessageService;

    @PostMapping
    public Result receiveMessage(@RequestBody Message message){
            log.info("message:{}",message);
            nettyMessageService.sendMessageToUser(message);
            return ResultGenerator.genSuccessResult();
    }
}
