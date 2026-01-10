package com.bjtu.freeChat.messagingservice.model.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RedPacketMessageBody {

    private String content;

    private String redPacketWrapperText;
}
