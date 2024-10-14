package com.fhminyi.pkg;

// 导包
import com.fhminyi.pkg.itcast.Demo1;
import com.fhminyi.pkg.itcast.Demo2;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();

        Demo1 d1 = new Demo1();
        d1.print();

        Scanner sc = new Scanner(System.in);
        String str = "ew";// String是在lang包中，不需要导包，可以直接调用

        Random r = new Random();

        Demo2 d2 = new Demo2();
        d2.print();

        // 同名的话要加包名前缀，不能直接导入包名用类名，会冲突
        com.fhminyi.pkg.fhminyi.Demo2 d3 = new com.fhminyi.pkg.fhminyi.Demo2();
        d3.print();

    }
}
