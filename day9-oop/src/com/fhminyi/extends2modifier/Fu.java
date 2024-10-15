package com.fhminyi.extends2modifier;

public class Fu {
    //1. 私有方法:只能在本类中访问
    private void privateMethod() {
        System.out.println("父类私有方法");
    }
    //2. 默认方法:只能在本包中访问
    void method() {
        System.out.println("父类默认方法");
    }
    //3. 受保护方法:本包和子类中都可以访问
    protected void protectedMethod() {
        System.out.println("父类受保护方法");
    }
    //4. 公有方法:本类、子类、本包和外包类都可以访问
    public void publicMethod() {
        System.out.println("父类共有方法");
    }

    public static void main(String[] args) {
        Fu f = new Fu();
        f.privateMethod();
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
