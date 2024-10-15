package com.fhminyi.polymorphism1;

public class Wolf extends Animal{
    String name = "狼";
    public void print()
    {
        System.out.println(name);
    }
    @Override
    public void run() {
        System.out.println("Wolf is running");
    }
}
