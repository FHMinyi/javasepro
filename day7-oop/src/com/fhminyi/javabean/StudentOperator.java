package com.fhminyi.javabean;

public class StudentOperator {
    Student student;
    public StudentOperator(Student student) {
        this.student = student;
    }
    public void printPass() {
        if(student.getScore() >= 60) {
            System.out.println(student.getName() + " Pass");
        } else {
            System.out.println(student.getName() + " Fail");
        }
    }
}
