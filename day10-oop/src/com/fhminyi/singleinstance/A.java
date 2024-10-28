package com.fhminyi.singleinstance;

public class A {
    // 2. 定义一个静态的成员变量：记住当前类的对象
//    public static final A a = new A();
    private static  A a = new A();
    // 饿汉式单例: 在类加载的时候就创建对象

    // 1. 私有化构造器：确保单例对外不能创造太多对象
    private A(){};

    // 3. 提供一个方法：返回当前类的对象
    public static A getInstance(){
        return a;
    }
}
