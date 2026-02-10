package com.gla.Methods;

public class Student {
    int roll_no;
    String name;
    Double cpi;
    String course;
    static String college="GLA University";      //static variable use for data which is same for all
    public static void main() {
        Student s1 = new Student();//instance variable jo change ho sab student ka
        s1.name = "Rahul";
        s1.cpi =6.5;
        s1.course="B.Tech";
        s1.roll_no=10;
        System.out.println("name is "+s1.name);
        System.out.println(s1.cpi);
        System.out.println(s1.course);
        System.out.println(s1.roll_no);
        System.out.println("college name is "+Student.college);//for static variable
        Student s2=new Student();
        s2.name="kumar";
        s2.cpi=9.9;
        s2.course="Bsc Agri";
        s2.roll_no=45;
        System.out.println("name is "+s2.name);
        System.out.println(s2.cpi);
        System.out.println(s2.course);
        System.out.println(s2.roll_no);
        System.out.println("college name "+Student.college);
    }

}
