package com.hsd.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsd.mapper.CommentMapper;
import com.hsd.mapper.RUserMapper;
import com.hsd.model.RUser;
import com.hsd.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private RUserMapper rUserMapper;
    @Override
    public List<Map<String, Object>> listPageInfor(int s, int e) {
        return commentMapper.listPageInfor(s,e);
    }

    @Override
    public List<Map<String, Object>> listInfor() {
        return commentMapper.listInfor();
    }

    @Override
    public List<Map<String, Object>> listPosition() {
        return commentMapper.listPosition();
    }

    @Override
    public List<RUser> findAllUser() {
        return rUserMapper.findAllUser();
    }

    @Override
    public List<RUser> findAllUserPage(int s, int e) {
        return rUserMapper.findAllUserPage(s,e);
    }
}
