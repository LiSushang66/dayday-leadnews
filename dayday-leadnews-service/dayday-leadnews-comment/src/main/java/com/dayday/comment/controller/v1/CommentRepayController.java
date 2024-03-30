package com.dayday.comment.controller.v1;


import com.dayday.comment.service.CommentRepayService;
import com.dayday.model.comment.dtos.CommentRepayDto;
import com.dayday.model.comment.dtos.CommentRepayLikeDto;
import com.dayday.model.comment.dtos.CommentRepaySaveDto;
import com.dayday.model.common.dtos.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/comment_repay")
public class CommentRepayController{


    @Autowired
    private CommentRepayService commentRepayService;

    @PostMapping("/load")
    public ResponseResult loadCommentRepay(@RequestBody CommentRepayDto dto){
        return commentRepayService.loadCommentRepay(dto);
    }

    @PostMapping("/save")
    public ResponseResult saveCommentRepay(@RequestBody CommentRepaySaveDto dto){
        return commentRepayService.saveCommentRepay(dto);
    }

    @PostMapping("/like")
    public ResponseResult saveCommentRepayLike(@RequestBody CommentRepayLikeDto dto){
        return commentRepayService.saveCommentRepayLike(dto);
    }

}