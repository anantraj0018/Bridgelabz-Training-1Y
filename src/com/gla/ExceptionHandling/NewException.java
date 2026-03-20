package com.gla.ExceptionHandling;

import java.sql.SQLOutput;

public class NewException {
    public static void main(String[] args){
int a=10;
int b=0;
        try{

            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block har bar execute hoga ");
        }
    }
}
