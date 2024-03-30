package com.dayday.wemedia.service;

import com.dayday.model.common.dtos.PageResponseResult;
import com.dayday.model.common.dtos.ResponseResult;
import com.dayday.model.wemedia.dtos.StatisticsDto;

import java.util.Date;

public interface WmStatisticsService {

    /**
     * 图文统计
     * @param beginDate
     * @param endDate
     * @return
     */
    public ResponseResult newsDimension(String beginDate, String endDate);

    /**
     * 分页查询图文统计
     * @param dto
     * @return
     */
    PageResponseResult newsPage(StatisticsDto dto);
}
