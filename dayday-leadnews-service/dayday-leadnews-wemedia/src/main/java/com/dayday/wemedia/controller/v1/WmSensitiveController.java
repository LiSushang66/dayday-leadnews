package com.dayday.wemedia.controller.v1;

import com.dayday.model.common.dtos.ResponseResult;
import com.dayday.model.wemedia.dtos.SensitiveDto;
import com.dayday.model.wemedia.pojos.WmSensitive;
import com.dayday.wemedia.service.WmSensitiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/sensitive")
public class WmSensitiveController {

    @Autowired
    private WmSensitiveService wmSensitiveService;

    @PostMapping("/list")
    public ResponseResult list(@RequestBody SensitiveDto dto){
        return wmSensitiveService.list(dto);
    }

    @PostMapping("/save")
    public ResponseResult insert(@RequestBody WmSensitive wmSensitive){
        return wmSensitiveService.insert(wmSensitive);
    }

    @PostMapping("/update")
    public ResponseResult update(@RequestBody WmSensitive wmSensitive){
        return wmSensitiveService.update(wmSensitive);
    }

    @DeleteMapping("/del/{id}")
    public ResponseResult delete(@PathVariable("id") Integer id){
        return wmSensitiveService.delete(id);
    }
}
