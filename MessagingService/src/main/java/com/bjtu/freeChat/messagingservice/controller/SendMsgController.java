package com.bjtu.freeChat.messagingservice.controller;


import com.bjtu.freeChat.messagingservice.model.dto.SendMsgRequest;
import com.bjtu.freeChat.messagingservice.common.Result;
import com.bjtu.freeChat.messagingservice.common.ResultGenerator;
import com.bjtu.freeChat.messagingservice.model.vo.ResponseMsgVo;
import com.bjtu.freeChat.messagingservice.service.MessagingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api")
public class SendMsgController {

    @Autowired
    private MessagingService messagingService;

    @PostMapping("/v1/chat/session")
    public Result<ResponseMsgVo> sendMsg(@RequestBody SendMsgRequest sendMsgRequest) throws Exception {
        ResponseMsgVo response = messagingService.sendMessage(sendMsgRequest);
        log.info(sendMsgRequest.toString());
        return ResultGenerator.genSuccessResult(response);
    }

}
