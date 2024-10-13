package com.fhminyi.javabean;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("播妞");
        s1.setScore(98);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());
        Student s2 = new Student("李四",23);
        StudentOperator sop = new StudentOperator(s2);
        sop.printPass();
    }
}
