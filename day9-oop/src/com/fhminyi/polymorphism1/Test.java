package com.fhminyi.polymorphism1;

public class Test {
    public static void main(String[] args) {
        // 变量不多态
        Animal wolf = new Wolf();
        wolf.run();
        Animal t = new Tortoise();
        t.run();

        System.out.println(wolf.name);
        wolf.print();
    }
}
