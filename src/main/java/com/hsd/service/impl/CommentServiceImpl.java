package com.hsd.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsd.mapper.CommentMapper;
import com.hsd.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    
    @Override
    public List<Map<String, Object>> listPageInfor(int s, int e) {
        return commentMapper.listPageInfor(s,e);
    }

    @Override
    public List<Map<String, Object>> listInfor() {
        // TODO Auto-generated method stub
        return commentMapper.listInfor();
    }
}
