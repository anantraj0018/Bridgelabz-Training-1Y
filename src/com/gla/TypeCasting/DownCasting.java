package com.gla.TypeCasting;

public class DownCasting {
    static class Vehicle {
        void display() {
            System.out.println("Vehicle class");
        }
    }
    static class Maruti extends Vehicle {
        void speed() {
            System.out.println("Car runs fast");
        }
    }
    public static void main(String[] args) {
        Vehicle v = new Maruti();
        Maruti m = (Maruti) v;
        m.display();
        m.speed();
    }
}