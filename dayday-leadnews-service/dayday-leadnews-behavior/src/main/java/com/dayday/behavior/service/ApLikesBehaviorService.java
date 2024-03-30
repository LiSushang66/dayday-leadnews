package com.dayday.behavior.service;

import com.dayday.model.behavior.dtos.LikesBehaviorDto;
import com.dayday.model.common.dtos.ResponseResult;

public interface ApLikesBehaviorService {

    /**
     * 存储喜欢数据
     * @param dto
     * @return
     */
    public ResponseResult like(LikesBehaviorDto dto);
}
