package com.hsd.service;

import java.util.List;
import java.util.Map;


public interface CommentService {

    List<Map<String, Object>> listPageInfor(int s, int e);

    List<Map<String, Object>> listInfor();

}
