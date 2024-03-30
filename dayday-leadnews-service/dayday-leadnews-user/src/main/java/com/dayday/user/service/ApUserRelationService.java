package com.dayday.user.service;


import com.dayday.model.common.dtos.ResponseResult;
import com.dayday.model.user.dtos.UserRelationDto;


public interface ApUserRelationService {
    /**
     * 用户关注/取消关注
     * @param dto
     * @return
     */
    public ResponseResult follow(UserRelationDto dto);
}