package com.fhminyi.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("郑丯玲");
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add(2,"佳妮");

        System.out.println(list);

        System.out.println(list.get(2));

        System.out.println(list.remove(3));

        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.remove("java"));

        System.out.println(list);

        System.out.println(list.set(2, "黄佳妮"));

        System.out.println(list);

    }
}
