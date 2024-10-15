package com.fhminyi.feature;

public class Test {
    public static void main(String[] args) {
        Son s = new Son();
        s.print();
    }
}

class Fa {
    String name = "Fa";
}

class Son1 extends Fa {
    String name = "Son1";
}

class Son extends Son1 {
    String name = "Son";

    public void print() {
        String name = "Local";
        System.out.println(name);
        System.out.println(this.name);
//        System.out.println(((Son1)this).name);
        System.out.println(super.name);
        System.out.println(((Fa) this).name);
    }
}

