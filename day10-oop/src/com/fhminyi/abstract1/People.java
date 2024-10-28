package com.fhminyi.abstract1;

public abstract class People {
    public final void write() {
        System.out.println("第一段");
//        System.out.println("第二段");
        writeMain();
        System.out.println("第三段");
    }
    public abstract void writeMain();
}
