package com.bjtu.freeChat.offlineDataStore.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bjtu.freeChat.offlineDataStore.model.entity.UserSession;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Zzw
* @description 针对表【user_session】的数据库操作Mapper
* @createDate 2024-09-20 16:41:50
* @Entity generator.domain.UserSession
*/
@Mapper
public interface UserSessionMapper extends BaseMapper<UserSession> {

}




