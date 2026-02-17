package com.gla;
abstract class car{
    abstract void color();
    public void company(){
        System.out.println("TATA");
    }
}
class safari extends car{

    @Override
    void color() {
        System.out.println("yellow");
    }
}
public class newabstraction {
    public static void main(String[] args){
        safari s1=new safari();
        s1.color();
        s1.company();
    }
}
