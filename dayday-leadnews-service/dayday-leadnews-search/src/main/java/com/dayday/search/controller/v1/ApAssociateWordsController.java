package com.dayday.search.controller.v1;

import com.dayday.search.service.ApAssociateWordsService;
import com.dayday.model.common.dtos.ResponseResult;
import com.dayday.model.search.dtos.UserSearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/associate")
public class ApAssociateWordsController {

    @Autowired
    private ApAssociateWordsService apAssociateWordsService;

    @PostMapping("/search")
    public ResponseResult search(@RequestBody UserSearchDto dto){
        return apAssociateWordsService.search(dto);
    }
}
