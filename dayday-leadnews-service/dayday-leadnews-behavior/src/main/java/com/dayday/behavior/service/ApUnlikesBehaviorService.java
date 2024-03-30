package com.dayday.behavior.service;

import com.dayday.model.behavior.dtos.UnLikesBehaviorDto;
import com.dayday.model.common.dtos.ResponseResult;

/**
 * <p>
 * APP不喜欢行为表 服务类
 * </p>
 *
 * @author itdayday
 */
public interface ApUnlikesBehaviorService {

    /**
     * 不喜欢
     * @param dto
     * @return
     */
    public ResponseResult unLike(UnLikesBehaviorDto dto);

}