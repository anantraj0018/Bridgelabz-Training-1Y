package com.gla.abstraction;
abstract class Fruit{
    abstract void test(); //abstract class
    public void color(){  //non abstract class
        System.out.println("Yellow");
    }
}
class Mango extends Fruit{ // class for output of abstract class

    @Override
    void test() {
        System.out.println("Sweet");
    }
}
class PineApple extends Fruit{

    @Override
    void test() {
        System.out.println("sour");
    }
}
public class AbstractionPractice {
    public static void main(String[] args){
        Mango m1=new Mango();
        PineApple p1=new PineApple();  //object is made only for nonabstract class
        m1.test();
        m1.color();
        p1.test();
        Fruit f1=new Mango();
        Fruit f2=new PineApple();
        f1.color();
        f1.test();
        f2.test();
    }
}
