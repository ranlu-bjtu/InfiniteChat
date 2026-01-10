package com.bjtu.freeChat.realtimeCommunicationService.service;

import com.bjtu.freeChat.realtimeCommunicationService.module.vo.sys.OnlineUserVo;

/**
 * @InterfaceName SysService
 * @Description 系统接口服务
 * @Author WangKun
 * @Date 2024/11/23 17:08
 */
public interface SysService {
    OnlineUserVo getOnlineUser();
}
