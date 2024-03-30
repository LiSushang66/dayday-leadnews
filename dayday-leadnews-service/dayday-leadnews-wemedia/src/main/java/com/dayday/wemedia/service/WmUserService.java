package com.dayday.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dayday.model.common.dtos.ResponseResult;
import com.dayday.model.wemedia.dtos.WmLoginDto;
import com.dayday.model.wemedia.pojos.WmUser;

public interface WmUserService extends IService<WmUser> {

    /**
     * 自媒体端登录
     * @param dto
     * @return
     */
    public ResponseResult login(WmLoginDto dto);

}