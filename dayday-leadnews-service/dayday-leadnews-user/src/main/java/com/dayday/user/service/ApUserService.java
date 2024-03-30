package com.dayday.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dayday.model.common.dtos.ResponseResult;
import com.dayday.model.user.dtos.LoginDto;
import com.dayday.model.user.pojos.ApUser;

public interface ApUserService extends IService<ApUser> {
    /**
     * app端登录功能
     * @param dto
     * @return
     */
    public ResponseResult login(LoginDto dto);
}
