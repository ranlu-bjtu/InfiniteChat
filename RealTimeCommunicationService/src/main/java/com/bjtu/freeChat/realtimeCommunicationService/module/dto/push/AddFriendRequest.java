package com.bjtu.freeChat.realtimeCommunicationService.module.dto.push;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AddFriendRequest {

    private String msg;
}
