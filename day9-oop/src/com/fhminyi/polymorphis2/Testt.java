package com.fhminyi.polymorphis2;

import com.fhminyi.polymorphism1.Animal;
import com.fhminyi.polymorphism1.Tortoise;
import com.fhminyi.polymorphism1.Wolf;

public class Testt {
    public static void main(String[] args) {
        Animal A1 = new Tortoise();
        Animal A2 = new Wolf();
//        Wolf w = (Wolf)A1; A1是龟，龟不能强制转换成狼
        go(A1);
    }

    public static void run(Animal a) {
        a.run();
    }

    public static void go(Animal a) {
        // 判断是龟还是狼
        if (a instanceof Tortoise) {
           ((Tortoise) a).rretractedHead();
        } else if(a instanceof Wolf) {
            ((Wolf) a).eatSheep();
        }
    }
}


