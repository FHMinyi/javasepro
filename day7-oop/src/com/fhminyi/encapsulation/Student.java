package com.fhminyi.encapsulation;

public class Student {
    private double score;
    public void setScore(double score){
        if(score >= 0 && score <= 100){
            this.score = score;
        } else {
            this.score = 0;
            System.out.println("数据不合法");
        }
    }
    public double getScore(){
        return score;
    }
}
