package com.fhminyi.interface1;

public interface A {
    //JDK8前 接口库中只能定义常量和抽象方法
    // 1. 接口中定义常量可以省略public static final 修饰符
    String SCHOOL_NAMW = "JYU";

    // 2. 抽象方法
//    public abstract void run();
    // 抽象方法也可以省略 public abstract
    void run();
    String go();
}
