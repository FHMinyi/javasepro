package com.fhminyi.code;

public class CodeDemo1 {

    public static String schoolName;
    static {
        System.out.println("hello world");
        schoolName = "JYU";
    }

    public static void main(String[] args) {
        System.out.println(schoolName);
    }
}
