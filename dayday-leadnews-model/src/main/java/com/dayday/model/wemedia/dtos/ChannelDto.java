package com.dayday.model.wemedia.dtos;

import com.dayday.model.common.dtos.PageRequestDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ChannelDto extends PageRequestDto {
    /**
     * 频道名称
     */
    @ApiModelProperty(value = "频道名称")
    private String name;
}
