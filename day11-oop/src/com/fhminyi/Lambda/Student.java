package com.fhminyi.Lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int age;
    private double score;
    public static int compareScore(Student student1, Student student2) {
        return Double.compare(student2.score, student1.score);
    }
}
