package com.fhminyi.object;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "播妞";
        s1.chinese = 40;
        s1.math = 40;
        s1.printAverageScore();

        Student s2 = new Student();
        s2.name = "播仔";
        s2.chinese = 90;
        s2.math = 54;
        s2.printTotalScore();
        s2.printAverageScore();

        System.out.println(s1);
        System.out.println(s2);

        Student s3 = s1;
        s1.name = "李四";
        s1.printTotalScore();
    }
}
