package com.hsd.service;

import java.util.List;
import java.util.Map;

import com.hsd.model.RUser;


public interface CommentService {

    List<Map<String, Object>> listPageInfor(int s, int e);

    List<Map<String, Object>> listInfor();

    List<Map<String, Object>> listPosition();

    List<RUser> findAllUser();

    List<RUser> findAllUserPage(int s, int e);

}
