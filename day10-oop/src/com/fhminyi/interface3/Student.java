package com.fhminyi.interface3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter setter
@AllArgsConstructor // 全参构造
@NoArgsConstructor // 无参构造
public class Student {
    private String name;
    private char sex;
    private double score;

    @Override
    public String toString() {
        return name + ' ' + sex + ' ' + score;
    }
}
