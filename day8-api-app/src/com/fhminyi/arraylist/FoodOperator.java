package com.fhminyi.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    ArrayList<Food> foodlist = new ArrayList<>();
    // 添加菜品信息
    public void addFood() {
        // 创建菜品对象
        Food food = new Food();
        // 输入菜品信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入菜品名称");
        String name = sc.next();
        food.setName(name);

        System.out.println("输入价格");
        double price = sc.nextDouble();
        food.setPrice(price);

        System.out.println("输入描述");
        String m = sc.next();
        food.set描述(m);

        // 菜品录入集合
        foodlist.add(food);
        System.out.println("菜品录入成功");
    }

    public void showAllFoods() {
        if(foodlist.size() == 0) {
            System.out.println("先去上架，这里没有菜品");
            return;
        }
        for (Food food : foodlist) {
            System.out.println(food.getName());
            System.out.println(food.getPrice());
            System.out.println(food.get描述());
        }
    }

    public void start() {
        System.out.println("欢迎来到菜品操作系统");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请选择功能：");
            System.out.println("1. 上架菜品");
            System.out.println("2. 展示菜品");
            System.out.println("3. 退出");
            System.out.println("请输入命令");
            int op = sc.nextInt();
            switch (op) {
                case 1 :
                    addFood();
                    break;
                case 2:
                    showAllFoods();;
                    break;
                case 3:
                    return;
                default:
                    System.out.println("命令有误，请重试");
            }
        }
    }
}
