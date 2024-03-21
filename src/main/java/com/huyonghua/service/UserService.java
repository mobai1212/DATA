package com.huyonghua.service;

import com.huyonghua.domain.User;


public interface UserService {
    public User findUserByName(String name);
}