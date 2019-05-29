package com.hsd.mapper;

import com.hsd.model.RNotice;

public interface RNoticeMapper {
    int insert(RNotice record);

    int insertSelective(RNotice record);
}