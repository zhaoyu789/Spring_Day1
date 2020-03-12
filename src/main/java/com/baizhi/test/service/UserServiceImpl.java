package com.baizhi.test.service;

import com.baizhi.test.dao.UserDao;
import com.baizhi.test.dao.UserdaoImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public void setUserDao(UserdaoImpl userDao) {
    }


    @Override
    public void insert() {
        userDao.save();
    }


}
