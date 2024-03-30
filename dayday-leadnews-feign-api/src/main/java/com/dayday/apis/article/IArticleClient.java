package com.dayday.apis.article;

import com.dayday.apis.article.fallback.IArticleClientFallback;
import com.dayday.model.article.dtos.ArticleCommentDto;
import com.dayday.model.article.dtos.ArticleDto;
import com.dayday.model.article.pojos.ApArticle;
import com.dayday.model.comment.dtos.CommentConfigDto;
import com.dayday.model.common.dtos.PageResponseResult;
import com.dayday.model.common.dtos.ResponseResult;
import com.dayday.model.wemedia.dtos.StatisticsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Date;


@FeignClient(value = "leadnews-article",fallback = IArticleClientFallback.class)
public interface IArticleClient {

    @PostMapping("/api/v1/article/save")
    public ResponseResult saveArticle(@RequestBody ArticleDto dto) ;

    @GetMapping("/api/v1/article/queryLikesAndConllections")
    ResponseResult queryLikesAndConllections(@RequestParam("wmUserId") Integer wmUserId,@RequestParam("beginDate") Date beginDate,@RequestParam("endDate") Date endDate);

    @PostMapping("/api/v1/article/newPage")
    PageResponseResult newPage(@RequestBody StatisticsDto dto);

    @GetMapping("/api/v1/article/findArticleConfigByArticleId/{articleId}")
    ResponseResult findArticleConfigByArticleId(@PathVariable("articleId") Long articleId);

    @PostMapping("/api/v1/article/findNewsComments")
    public PageResponseResult findNewsComments(@RequestBody ArticleCommentDto dto);

    @PostMapping("/api/v1/article/updateCommentStatus")
    public ResponseResult updateCommentStatus(@RequestBody CommentConfigDto dto);


}