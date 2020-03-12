package com.baizhi.test.factoryBean;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.FactoryBean;

import javax.annotation.Resource;
import java.io.InputStream;

public class MySqlSessionFactory implements FactoryBean<SqlSessionFactory> {

    @Override
    public SqlSessionFactory getObject() throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory SqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        return SqlSessionFactory;
    }

    @Override
    public Class<?> getObjectType() {
        return SqlSessionFactory.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
