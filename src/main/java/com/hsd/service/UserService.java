package com.hsd.service;

import com.hsd.model.User;

public interface UserService {

    User findUser(String username, String password);
    
}
