package com.baizhi.test.dao;

public class UserdaoImpl  implements  UserDao{
    @Override
    public void save() {
        System.out.println("我是 UserDaoImpl 的实现类");
    }
}
