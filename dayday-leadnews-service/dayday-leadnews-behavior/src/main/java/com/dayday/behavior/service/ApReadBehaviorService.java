package com.dayday.behavior.service;

import com.dayday.model.behavior.dtos.ReadBehaviorDto;
import com.dayday.model.common.dtos.ResponseResult;

public interface ApReadBehaviorService {

    /**
     * 保存阅读行为
     * @param dto
     * @return
     */
    public ResponseResult readBehavior(ReadBehaviorDto dto);
}
