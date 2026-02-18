package com.gla.abstraction;

public interface Bike {
    String color="Black";
    String company="BMW";
    public void engine(); //in interface non abstract is not initialize
    public void speed();
}
class S1000RR implements Bike{

    @Override
    public void engine() {
        System.out.println("999 CC Inline 4 Cylinder");
    }

    @Override
    public void speed() {
      System.out.println("303 km/h");
    }
}