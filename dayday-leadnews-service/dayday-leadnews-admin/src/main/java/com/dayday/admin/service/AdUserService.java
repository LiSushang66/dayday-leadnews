package com.dayday.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dayday.model.admin.dtos.AdUserDto;
import com.dayday.model.admin.pojos.AdUser;
import com.dayday.model.common.dtos.ResponseResult;

public interface AdUserService extends IService<AdUser> {

    /**
     * 登录
     * @param dto
     * @return
     */
    public ResponseResult login(AdUserDto dto);
}
