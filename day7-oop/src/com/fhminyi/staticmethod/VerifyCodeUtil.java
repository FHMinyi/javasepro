package com.fhminyi.staticmethod;

import java.util.Random;

public class VerifyCodeUtil {
    // 工具类没有创造实例的必要
    private VerifyCodeUtil() {}

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
