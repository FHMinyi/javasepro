package com.fhminyi.interface2;

public class Test {
    public static void main(String[] args) {
        // 接口弥补单继承的不足
        People p = new Student();
        Driver d = new Student();
        Girlfriend g = new Student();
        // 接口库可以实现面向接口编程，有利于解耦合
    }
}

class People {}
interface Driver {}
interface Girlfriend {}


class Student extends People implements Driver, Girlfriend {}