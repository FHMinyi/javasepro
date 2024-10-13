package com.fhminyi.constructor;



public class Test {
    // 构造器
    public static void main(String[] args) {
        Student s1 = new Student("李华",23);
        System.out.println(s1);
        Teacher t = new Teacher();
        System.out.println(t.name);
    }


}
