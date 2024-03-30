package com.dayday.wemedia.service;

import com.dayday.model.common.dtos.ResponseResult;
import com.dayday.model.wemedia.pojos.WmNews;

public interface WmNewsAutoScanService {

    /**
     * 自媒体文章审核
     * @param id  自媒体文章id
     */
    public void autoScanWmNews(Integer id);

    /**
     * 保存app文章数据
     * @param wmNews
     * @return
     */
    public ResponseResult saveAppArticle(WmNews wmNews);
}