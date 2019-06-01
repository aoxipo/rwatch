package com.hsd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsd.mapper.UserMapper;
import com.hsd.model.User;
import com.hsd.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser(String username, String password) {
        // TODO Auto-generated method stub
        return userMapper.findUser(username,password);
    }

      
}
