package com.dayday.wemedia.controller.v1;

import com.dayday.wemedia.service.WmStatisticsService;
import com.dayday.model.common.dtos.PageResponseResult;
import com.dayday.model.common.dtos.ResponseResult;
import com.dayday.model.wemedia.dtos.StatisticsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/statistics")
public class WmStatisticsController {

    @Autowired
    private WmStatisticsService wmStatisticsService;

    @GetMapping("/newsDimension")
    public ResponseResult newsDimension(String beginDate,String endDate){
        return wmStatisticsService.newsDimension(beginDate,endDate);
    }

    @GetMapping("/newsPage")
    public PageResponseResult newsPage(StatisticsDto dto){
        return wmStatisticsService.newsPage(dto);
    }
}
