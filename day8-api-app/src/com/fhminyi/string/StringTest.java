package com.fhminyi.string;

import java.util.Random;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        int n;
        Scanner sc =  new Scanner(System.in);
        n = sc.nextInt();
        String code = createCode(n);
        System.out.println(code);
        String str = sc.next();
        System.out.println(str.equalsIgnoreCase(code));
    }

    // 1. 返回指定位数验证码
    public static String createCode(int n) {
        //2. 定义2个变量 一个是记住最终产生的随机验证码 一个是记住可能用到的全部字符
        String code = "";
        String data = "qwertyuiopasdfghjklzxcvbnm1234567890QWERTYUIOPASDFGHJKLZXCVBNM";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }
}
