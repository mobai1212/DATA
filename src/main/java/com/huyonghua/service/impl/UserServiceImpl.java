package com.huyonghua.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huyonghua.dao.UserDao;
import com.huyonghua.domain.User;
import com.huyonghua.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    @Override
    public User findUserByName(String name) {
        // TODO Auto-generated method stub
        return this.userDao.findByUsername(name);
    }
}