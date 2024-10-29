package com.fhminyi.interface3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ClassDataInter1 implements ClassDataInter{
    private Student[] students;
    @Override
    public void printAllSutudentInfo() {
        System.out.println("全班学生信息如下：");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void printAverageScore() {
        double total = 0;
        for (Student student : students) {
            total += student.getScore();
        }
        System.out.println("全班平均成绩为：" + total / students.length);
    }
}
