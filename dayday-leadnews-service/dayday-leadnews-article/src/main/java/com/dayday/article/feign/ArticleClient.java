package com.dayday.article.feign;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.dayday.article.service.ApArticleConfigService;
import com.dayday.article.service.ApArticleService;
import com.dayday.apis.article.IArticleClient;
import com.dayday.model.article.dtos.ArticleCommentDto;
import com.dayday.model.article.dtos.ArticleDto;
import com.dayday.model.article.pojos.ApArticle;
import com.dayday.model.article.pojos.ApArticleConfig;
import com.dayday.model.comment.dtos.CommentConfigDto;
import com.dayday.model.common.dtos.PageResponseResult;
import com.dayday.model.common.dtos.ResponseResult;
import com.dayday.model.wemedia.dtos.StatisticsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class ArticleClient implements IArticleClient {

    @Autowired
    private ApArticleService apArticleService;

    @Override
    @PostMapping("/api/v1/article/save")
    public ResponseResult saveArticle(@RequestBody ArticleDto dto) {
        return apArticleService.saveArticle(dto);
    }

    @GetMapping("/api/v1/article/queryLikesAndConllections")
    @Override
    public ResponseResult queryLikesAndConllections(@RequestParam("wmUserId") Integer wmUserId,@RequestParam("beginDate") Date beginDate,@RequestParam("endDate") Date endDate) {
        return apArticleService.queryLikesAndConllections(wmUserId,beginDate,endDate);
    }

    @PostMapping("/api/v1/article/newPage")
    @Override
    public PageResponseResult newPage(@RequestBody StatisticsDto dto) {
        return apArticleService.newPage(dto);
    }

    @Autowired
    private ApArticleConfigService apArticleConfigService;

    @GetMapping("/api/v1/article/findArticleConfigByArticleId/{articleId}")
    @Override
    public ResponseResult findArticleConfigByArticleId(@PathVariable("articleId") Long articleId) {
        ApArticleConfig apArticleConfig = apArticleConfigService.getOne(Wrappers.<ApArticleConfig>lambdaQuery().eq(ApArticleConfig::getArticleId, articleId));
        return ResponseResult.okResult(apArticleConfig);
    }

    @PostMapping("/api/v1/article/findNewsComments")
    @Override
    public PageResponseResult findNewsComments(@RequestBody ArticleCommentDto dto) {
        return apArticleService.findNewsComments(dto);
    }

    @PostMapping("/api/v1/article/updateCommentStatus")
    @Override
    public ResponseResult updateCommentStatus(@RequestBody CommentConfigDto dto) {
        return apArticleConfigService.updateCommentStatus(dto);
    }
}