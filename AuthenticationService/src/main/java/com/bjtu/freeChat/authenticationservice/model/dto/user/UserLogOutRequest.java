package com.bjtu.freeChat.authenticationservice.model.dto.user;


import java.io.Serializable;

import lombok.Data;

@Data
public class UserLogOutRequest implements Serializable {

    private Long userId;
}
