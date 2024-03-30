package com.dayday.wemedia.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dayday.model.wemedia.dtos.NewsAuthDto;
import com.dayday.model.wemedia.pojos.WmNews;
import com.dayday.model.wemedia.vo.WmNewsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WmNewsMapper  extends BaseMapper<WmNews> {

    List<WmNewsVo> findListAndPage(@Param("dto") NewsAuthDto dto);

    int findListCount(@Param("dto") NewsAuthDto dto);
}