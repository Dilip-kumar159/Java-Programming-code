package com.company;

interface parentinterface{
    void method1();
    void method2();
}
interface childinterface extends parentinterface{
    void method3();
    void method4();
    private void method5(){
        System.out.println("private Method 5");
    }
    default void method6(){
        method5();
        System.out.println("Default Method 6");
    }
}
class inter{
    public void method1(){
        System.out.println("method 1");
    }
    public void method2(){
        System.out.println("method 2");
    }
    public void method3(){
        System.out.println("method 3");
    }
    public void method4(){
        System.out.println("method 4");
    }
    void method6(){
        System.out.println("Default Method 6 in inter class");
    }
}
public class Inheritance_in_Interfaces {
    public static void main(String[] args) {
        inter i = new inter();
        i.method1();
        i.method2();
        i.method3();
        i.method4();
        i.method6();
//        i.method5(); // It throws an error because method 5 is an private method.
        // Using Reference of parent interface
//        childinterface p = new inter(); // not possible because it extends
//        p.method3();
//        p.method4();
    }
}
