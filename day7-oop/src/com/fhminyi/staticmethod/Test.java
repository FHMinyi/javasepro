package com.fhminyi.staticmethod;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student.printHelloWorld();
        Scanner scanner = new Scanner(System.in);
        String code = VerifyCodeUtil.createCode(7);
    }

}
