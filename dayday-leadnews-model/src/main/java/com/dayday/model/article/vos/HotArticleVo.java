package com.dayday.model.article.vos;

import com.dayday.model.article.pojos.ApArticle;
import lombok.Data;

@Data
public class HotArticleVo extends ApArticle {
    /**
     * 文章分值
     */
    private Integer score;
}