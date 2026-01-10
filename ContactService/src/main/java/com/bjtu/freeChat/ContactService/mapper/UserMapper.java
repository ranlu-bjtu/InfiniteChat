package com.bjtu.freeChat.ContactService.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bjtu.freeChat.ContactService.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}