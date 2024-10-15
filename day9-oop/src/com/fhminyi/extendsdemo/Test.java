package com.fhminyi.extendsdemo;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("李华");
        teacher.setSex('男');
        teacher.setSkill("Java,Python,C++");
        System.out.println(teacher.getName());
        System.out.println(teacher.getSex());
        System.out.println(teacher.getSkill());
        Consultants c = new Consultants();
        c.setNumber(100);
        System.out.println(c.getNumber());


    }
}
