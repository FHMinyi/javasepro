package com.fhminyi.interface1;

public class Test {
    public static void main(String[] args) {
        System.out.println(A.SCHOOL_NAMW);
        // 接口不能创建对象
    }
}

// C为实现类，同时实现多个接口
// 实现多个接口，必须重写多个接口的方法
class C implements A, B {

    @Override
    public void run() {

    }

    @Override
    public String go() {
        return "";
    }

    @Override
    public void play() {

    }
}