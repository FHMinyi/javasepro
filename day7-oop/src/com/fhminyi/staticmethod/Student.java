package com.fhminyi.staticmethod;

public class Student {
    private int score;
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public void Pass(int score) {
        System.out.println(score >= 60 ? "通过" : "挂科");
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
