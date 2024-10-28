package com.fhminyi.finaldemo;

public class FinalDemo1 {
    // 常量:使用static final修饰，常用于记录系统配置信息
    public static final String IIII = "kjajl";
    public static void main(String[] args) {
        // 3. final修饰的变量不能被修改
        /**
         * 变量
         * 成员变量：
         *      静态成员变量
         *      实例成员变量
         * 局部变量
         */
        // 4. final修饰引用变量，地址不能变，但是地址指向的对象的内容可以改变
        final int[] arr = {1,2,3};
        arr[0] = 100;
//        arr = new int[arr.length - 1];
    }
}




// 1. final修饰的类不能被继承
final class A {}

//class B extends A {}

// 2. final修饰的方法不能被重写

class C {
    public final void print() {
        System.out.println("hello");
    }
}

class D extends C {
//    @Override
//    public void print() {
//        System.out.println("world");
//    }
}


// https://www.bilibili.com/video/BV1464y1a74C