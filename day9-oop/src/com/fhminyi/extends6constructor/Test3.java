package com.fhminyi.extends6constructor;

public class Test3 {
    // 目标：理解this(...)调用兄弟构造器
    public static void main(String[] args) {
        Student mu = new Student("张三", '男', 18);
        System.out.println(mu);
        Student mu2 = new Student("李四",'女',18,"清华大学");
        System.out.println(mu2);
    }
}
