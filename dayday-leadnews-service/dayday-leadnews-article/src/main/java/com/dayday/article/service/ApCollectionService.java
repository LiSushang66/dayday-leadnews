package com.dayday.article.service;

import com.dayday.model.article.dtos.CollectionBehaviorDto;
import com.dayday.model.common.dtos.ResponseResult;

public interface ApCollectionService {

    /**
     * 收藏
     * @param dto
     * @return
     */
    public ResponseResult collection(CollectionBehaviorDto dto);
}
