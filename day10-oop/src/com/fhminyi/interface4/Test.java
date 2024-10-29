package com.fhminyi.interface4;

public class Test {
    public static void main(String[] args) {
        A a = new AImpl();
        a.go();
        A.print();
    }
}


class AImpl implements A {

}