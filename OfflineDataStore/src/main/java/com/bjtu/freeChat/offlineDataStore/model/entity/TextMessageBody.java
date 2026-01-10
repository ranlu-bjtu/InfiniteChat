package com.bjtu.freeChat.offlineDataStore.model.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TextMessageBody {

    private String content;

    private Long replyId;
}
