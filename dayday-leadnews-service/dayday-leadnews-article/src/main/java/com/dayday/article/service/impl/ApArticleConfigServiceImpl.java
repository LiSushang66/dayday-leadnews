package com.dayday.article.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dayday.article.service.ApArticleConfigService;
import com.dayday.article.mapper.ApArticleConfigMapper;
import com.dayday.model.article.pojos.ApArticleConfig;
import com.dayday.model.comment.dtos.CommentConfigDto;
import com.dayday.model.common.dtos.ResponseResult;
import com.dayday.model.common.enums.AppHttpCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
@Slf4j
@Transactional
public class ApArticleConfigServiceImpl extends ServiceImpl<ApArticleConfigMapper, ApArticleConfig> implements ApArticleConfigService {


    /**
     * 修改文章配置
     * @param map
     */
    @Override
    public void updateByMap(Map map) {
        //0 下架 1 上架
        Object enable = map.get("enable");
        boolean isDown = true;
        if(enable.equals(1)){
            isDown = false;
        }
        //修改文章配置
        update(Wrappers.<ApArticleConfig>lambdaUpdate().eq(ApArticleConfig::getArticleId,map.get("articleId"))
                .set(ApArticleConfig::getIsDown,isDown));

    }

    /**
     * 修改文章评论状态
     * @return
     */
    @Override
    public ResponseResult updateCommentStatus(CommentConfigDto dto) {
        update(Wrappers.<ApArticleConfig>lambdaUpdate()
                .eq(ApArticleConfig::getArticleId,dto.getArticleId())
                .set(ApArticleConfig::getIsComment,dto.getOperation()));
        return ResponseResult.okResult(AppHttpCodeEnum.SUCCESS);
    }
}