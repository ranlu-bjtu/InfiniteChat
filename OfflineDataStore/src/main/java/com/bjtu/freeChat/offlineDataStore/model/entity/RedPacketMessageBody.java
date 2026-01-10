package com.bjtu.freeChat.offlineDataStore.model.entity;

import com.bjtu.freeChat.offlineDataStore.model.vo.Body;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Accessors(chain = true)
public class RedPacketMessageBody extends Body {

    private String redPacketWrapperText;
}
