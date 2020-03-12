package com.baizhi.test.entity;

public class Order {

    public Order(){
        System.out.println("我是Order 的无参构造！");
    }
    public  void into(){
        System.out.println("对象创建后调用的初始化方法！");
    }
    public void destory(){
        System.out.println("对象销毁后调用的初始化方法");
    }
}
