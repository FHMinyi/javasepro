package com.fhminyi.interface4;

public interface A {
    //jdk8后新增了三种方法
    // 1. 默认方法(public)
    default void go(){// 通过接口的实现类来调用
        System.out.println("A.go()");
    }

    // 2. 私有方法 JDK9 新增
    private void run(){
        System.out.println("A.run()");
    }

    // 3. 静态方法(public) 只能用接口名调用
    static void print(){
        System.out.println("A.print()");
    }
}
