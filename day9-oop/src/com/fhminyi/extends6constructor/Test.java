package com.fhminyi.extends6constructor;

public class Test {
    public static void main(String[] args) {
        Son s = new Son();
        s.setA(1);
    }




}
class Son extends Father {
    // 子类构造器默认先调用父类无参构造器
    public Son()
    {
//        super(12);
        super();//默认调用
        System.out.println("子类无参构造器");
    }
}

class Father {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Father()
    {
        System.out.println("父类无参构造器");
    }
    public Father(int a)
    {
        System.out.println("父类有参构造器");
    }
}