package com.fhminyi.finaldemo;

public class FinalDemo2 {
    public static void main(String[] args) {
        // 详解常量
//        一般开发会专门有个常量类：可读性
        System.out.println(Constant.SYSTEM_NAME);// 被宏替换, 直接变成常量
        System.out.println(Constant.SYSTEM_NAME);
        System.out.println(Constant.SYSTEM_NAME);
        System.out.println(Constant.SYSTEM_NAME);
    }
}
