package com.dayday.article.controller.v1;

import com.dayday.article.service.ApArticleService;
import com.dayday.model.article.dtos.ArticleInfoDto;
import com.dayday.model.common.dtos.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/article")
public class ArticleInfoController {

    @Autowired
    private ApArticleService apArticleService;

    @PostMapping("/load_article_behavior")
    public ResponseResult loadArticleBehavior(@RequestBody ArticleInfoDto dto){
        return apArticleService.loadArticleBehavior(dto);
    }
}