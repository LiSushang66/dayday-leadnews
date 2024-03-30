package com.dayday.search.service;

import com.dayday.model.common.dtos.ResponseResult;
import com.dayday.model.search.dtos.UserSearchDto;

public interface ApAssociateWordsService {

    /**
     * 搜索联想词
     * @param dto
     * @return
     */
    public ResponseResult search(UserSearchDto dto);
}
