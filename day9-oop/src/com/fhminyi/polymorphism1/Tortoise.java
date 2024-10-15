package com.fhminyi.polymorphism1;

public class Tortoise extends Animal{
    String name = "龟";
    @Override
    public void run() {
        System.out.println("Tortoise is running");
    }
}
