package com.fhminyi.staticfield;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student.name = "郑丯玲";
        Student s2 = new Student();
        s2.name = "小明";
        System.out.println(s1.name);
        User u1 = new User();
        User u2 = new User();
        new User();
        new User();
        System.out.println(User.userccount);
    }
}
