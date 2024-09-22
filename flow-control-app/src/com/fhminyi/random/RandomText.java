package com.fhminyi.random;

import java.util.Random;
import java.util.Scanner;

public class RandomText {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int data = rand.nextInt(100) + 1;
        System.out.print("请输入一个整数（0-100）:");
        while(true) {
            int choice = sc.nextInt();
            if(choice == data) {
                System.out.println("猜对了");
                break;
            } else {
                System.out.print("猜错了，");
                if(choice < data) {
                    System.out.print("数字太小，请重新输入：");
                } else {
                    System.out.print("数字太大，请重新输入：");
                }
            }
        }
    }
}
