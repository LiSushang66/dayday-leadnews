package com.dayday.comment.service;

import com.dayday.model.comment.dtos.CommentRepayDto;
import com.dayday.model.comment.dtos.CommentRepayLikeDto;
import com.dayday.model.comment.dtos.CommentRepaySaveDto;
import com.dayday.model.common.dtos.ResponseResult;

/**
 * 评论回复
 */
public interface CommentRepayService {

    /**
     * 查看更多回复内容
     * @param dto
     * @return
     */
    public ResponseResult loadCommentRepay(CommentRepayDto dto);

    /**
     * 保存回复
     * @return
     */
    public ResponseResult saveCommentRepay(CommentRepaySaveDto dto);

    /**
     * 点赞回复的评论
     * @param dto
     * @return
     */
    public ResponseResult saveCommentRepayLike(CommentRepayLikeDto dto);
}