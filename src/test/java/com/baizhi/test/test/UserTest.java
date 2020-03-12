package com.baizhi.test.test;

import com.baizhi.test.dao.UserDao;
import com.baizhi.test.entity.Order;
import com.baizhi.test.entity.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class UserTest {
    @Test
     public  void test(){
        //创建Spring 工厂
         ClassPathXmlApplicationContext as = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user =(User) as.getBean("user");
        User user2=(User)as.getBean("user");
        System.out.println(user);
        System.out.println(user2);
        as.close();
    }

    @Test
    public void test1(){
        ClassPathXmlApplicationContext ss = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userdao = (UserDao)ss.getBean("userDao");
        userdao.save();
    }
    //Spring 的实现对象的原理
    @Test
    public  void test3() throws Exception {
        Class<?> aClass = Class.forName("com.baizhi.test.entity.User");
        User o =(User) aClass.newInstance();
        System.out.println(o);
    }
    //测试connection 连接对象的创建
    @Test
    public void test4()throws  Exception{
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Connection connection =(Connection) classPathXmlApplicationContext.getBean("connection");
        //Connection connection2 =(Connection) classPathXmlApplicationContext.getBean("connection");

       /* MyConnection myConnection =(MyConnection) classPathXmlApplicationContext.getBean("&connection");
        System.out.println(myConnection);*/
        System.out.println(connection);
    }
    //测试SqlSessionFactory 的对象

    @Test
    public void test5()throws  Exception{
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SqlSessionFactory sqlSessionFactory =(SqlSessionFactory) classPathXmlApplicationContext.getBean("sqlSessionFactory");
        SqlSessionFactory sqlSessionFactory3 =(SqlSessionFactory) classPathXmlApplicationContext.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);
        System.out.println(sqlSessionFactory3);
    }
    //测试Spring 工厂什么时候创建对象 销毁对象
    @Test
    public void test9(){
        ClassPathXmlApplicationContext ss = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Order order =(Order) ss.getBean("order");
        System.out.println(order);
    }

}
