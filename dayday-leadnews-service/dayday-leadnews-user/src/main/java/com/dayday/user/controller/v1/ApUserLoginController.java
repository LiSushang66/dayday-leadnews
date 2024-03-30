package com.dayday.user.controller.v1;

import com.dayday.model.common.dtos.ResponseResult;
import com.dayday.model.user.dtos.LoginDto;
import com.dayday.user.service.ApUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/login")
@Api(value = "app端用户登录",tags = "app端用户登录")
public class ApUserLoginController {

    @Autowired
    private ApUserService apUserService;

    @PostMapping("/login_auth")
    @ApiOperation("用户登录")
    public ResponseResult login(@RequestBody LoginDto dto){
        return apUserService.login(dto);
    }
}
