package com.fhminyi;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("欢迎进入ATM系统");
            System.out.println("1. 用户登录");
            System.out.println("2. 用户开户");
            System.out.println("3. 退出系统");
            System.out.println("请选择");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    // 用户登录
                    break;
                case 2:
                    // 用户开户
                    break;
                case 3:
                    System.out.println("欢迎下次再来");
                    return;
                default:
                    System.out.println("没有该操作");
            }
        }
    }
    private void addAccount() {
        
    }
}
