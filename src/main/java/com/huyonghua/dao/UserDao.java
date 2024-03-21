package com.huyonghua.dao;

import com.huyonghua.domain.User;
// 声明 接口的调用方法
public interface UserDao {
    public User findByUsername(String username);
}