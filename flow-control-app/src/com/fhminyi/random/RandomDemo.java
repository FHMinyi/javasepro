package com.fhminyi.random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        // 导包
        // 创建对象
        Random rand = new Random();
        // 调用Random提供的功能
        for (int i = 0; i < 10; i++) {
            int data = rand.nextInt(27);
            System.out.print(data+65+" ");
        }
    }
}
