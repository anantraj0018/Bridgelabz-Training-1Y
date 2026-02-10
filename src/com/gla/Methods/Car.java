package com.gla.Methods;

public class Car {
    String colour;
    int sitting_cap;
    String model;
    String company;
    static int wheel_number=4;
    public static void main(){
        Car c1=new Car();
        c1.colour="Black";
        c1.sitting_cap=6;
        c1.model="SUV";
        c1.company="TATA";
        System.out.println("colour is "+c1.colour);
        System.out.println("sitting capacity is "+c1.sitting_cap);
        System.out.println("model is "+c1.model);
        System.out.println("company is "+c1.company);
        System.out.println("number of wheel "+Car.wheel_number);
    }
}
