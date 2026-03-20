package com.gla.ExceptionHandling;

public class ThrowException {
    static void ageChecker(int age) {
        if (age < 18) {
            throw new ArithmeticException("invalid age");
        }
        System.out.println("valid");
    }

    public static void main(String[] args) {
        ageChecker(10);
    }
}
