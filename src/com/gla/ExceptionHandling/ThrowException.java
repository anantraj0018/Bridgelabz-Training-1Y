package com.gla.ExceptionHandling;

public class ThrowException {
    public static void main(String[] args){
        int age=16;
        if(age<18){
            throw new ArithmeticException("invalid age");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }

}
