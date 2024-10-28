package com.fhminyi.singleinstance;

public class B {
    private static B b;
    private B(){}

    public static B getInstance()
    {
        if(b==null)
        {   // 在需要时才实例化对象
            b = new B();
        }
        return b;
    }
}

/**
 * 懒汉式单例
 *
 */
