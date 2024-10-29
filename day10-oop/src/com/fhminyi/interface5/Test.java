package com.fhminyi.interface5;

/**
 * 接口的注意事项
 */

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
    }
}
// 3. 一个类继承了父类，又同时实现了接口，如果父类中和接口中有同名的方法，实现类会优先用父类的。
interface A2 {
    default void show() {
        System.out.println("接口中的A2 show 方法");
    }
}
class Animal {
    public void show() {
        System.out.println("父类中的show方法");
    }
}
class Dog extends Animal implements A2 {

}

// 2. 接口的方法冲突了，就不支持多继承
interface A1 {
    void print();
}
interface B1  {
     void print();// 可以合并
//     String print();// 返回值不同，冲突
}
interface C1 extends A1, B1 {

}
class D1 implements C1 {
    @Override
    public void print() {

    }
}


//1. 接口与接口可以多继承
interface A {
    void print1();
}
interface B {
    void print2();
}
interface C extends A, B {
    void print3();
}
class D implements C {
    @Override
    public void print1() {

    }

    @Override
    public void print2() {

    }

    @Override
    public void print3() {

    }
}