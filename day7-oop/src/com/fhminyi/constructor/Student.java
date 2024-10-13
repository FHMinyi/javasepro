package com.fhminyi.constructor;

public class Student {
    String name;
    double score;
    // 构造器
    public Student() {

    } // 无参构造器
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
