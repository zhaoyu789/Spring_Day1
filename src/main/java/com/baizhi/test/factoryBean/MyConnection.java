package com.baizhi.test.factoryBean;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection implements FactoryBean<Connection> {
    private String driveClassName;
    private String url;
    private String username;
    private String password;

    public void setDriveClassName(String driveClassName) {
        this.driveClassName = driveClassName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //创建复杂对象的步骤
    @Override
    public Connection getObject() throws Exception {
        Class<?> aClass = Class.forName(driveClassName);
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
    //返回复杂对象的类型
    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }
    //决定创建对象的次数
    //true   :只创建一次
    //false  :每次创建新的对象
    //connection 对象连接不能被共享
    @Override
    public boolean isSingleton() {
        return false;
    }
}
