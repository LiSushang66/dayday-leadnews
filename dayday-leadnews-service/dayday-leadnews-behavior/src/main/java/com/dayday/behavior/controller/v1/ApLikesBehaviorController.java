package com.dayday.behavior.controller.v1;


import com.dayday.behavior.service.ApLikesBehaviorService;
import com.dayday.model.behavior.dtos.LikesBehaviorDto;
import com.dayday.model.common.dtos.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/likes_behavior")
public class ApLikesBehaviorController {

    @Autowired
    private ApLikesBehaviorService apLikesBehaviorService;

    @PostMapping
    public ResponseResult like(@RequestBody LikesBehaviorDto dto) {
        return apLikesBehaviorService.like(dto);
    }
}
