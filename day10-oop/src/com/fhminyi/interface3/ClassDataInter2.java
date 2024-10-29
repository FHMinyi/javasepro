package com.fhminyi.interface3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ClassDataInter2 implements ClassDataInter{
    private Student[] students;
    @Override
    public void printAllSutudentInfo() {
        int maleCount = 0;
        for (Student student : students) {
            if (student.getSex() == '男') {
                maleCount++;
            }
            System.out.println(student);
        }
        System.out.println("男学生个数为：" + maleCount);
        System.out.println("女学生个数为：" + (students.length - maleCount));
    }

    @Override
    public void printAverageScore() {
        double Maxscore = 0;
        double Minscore = 300;
        double total = 0;
        for (Student student : students) {
            total += student.getScore();
            if (student.getScore() > Maxscore) {
                Maxscore = student.getScore();
            }
            if (student.getScore() < Minscore) {
                Minscore = student.getScore();
            }
        }
        System.out.println("全班最高成绩为：" + Maxscore);
        System.out.println("全班最低成绩为：" + Minscore);
        System.out.println("全班平均成绩为：" + (total - Maxscore - Minscore) / (students.length - 2));
    }
}
