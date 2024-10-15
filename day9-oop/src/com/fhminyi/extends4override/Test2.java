package com.fhminyi.extends4override;

class Fa {
    public void printName() {
        System.out.println("Fa");
    }
}

class Son extends Fa {
    // 没有使用 @Override
    public void printName() {
        System.out.println("Son");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Fa fa = new Fa();
        fa.printName(); // 输出 "Fa"

        Son son = new Son();
        son.printName(); // 输出 "Son"

        // 调用父类引用指向子类对象的方法
        Fa faRef = new Son();
        faRef.printName(); // 输出 "Fa"，而不是 "Son"
    }
}
