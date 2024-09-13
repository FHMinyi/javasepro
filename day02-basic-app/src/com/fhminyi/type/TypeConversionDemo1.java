package com.fhminyi.type;

public class TypeConversionDemo1 {
    public static void main(String[] args) {
        byte b = 127;
        int a = b;// 发生自动类型转换
        System.out.println(a);
        System.out.println(b);
        // b的数据放到a的最后一个字节（从左到右）前三个字节补零
        char c = '中';
        int d = c;
        System.out.println(d);
    }
}
