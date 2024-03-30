package com.dayday.model.wemedia.dtos;

import com.dayday.model.common.dtos.PageRequestDto;
import lombok.Data;

@Data
public class SensitiveDto extends PageRequestDto {

    /**
     * 敏感词名称
     */
    private String name;
}
