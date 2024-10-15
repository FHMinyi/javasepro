package com.fhminyi.extends2modifier;

public class Test {
    public static void main(String[] args) {
        Fu f = new Fu();
//        f.privateMethod();
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
