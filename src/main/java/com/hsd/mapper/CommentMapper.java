package com.hsd.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.hsd.model.RUser;

public interface CommentMapper {

    List<Map<String, Object>> listInfor();

    List<Map<String, Object>> listPageInfor(@Param(value="s")int s,
            @Param(value="e")int e);

    List<Map<String, Object>> listPosition();

    
}
