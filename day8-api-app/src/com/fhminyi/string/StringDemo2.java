package com.fhminyi.string;

public class StringDemo2 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("ABC") + "ABC";
        System.out.println(str2);
        String str3 = "a" + "b" + "c";
        System.out.println(str3);
    }
}
