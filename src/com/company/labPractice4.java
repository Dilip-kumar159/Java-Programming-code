package com.company;

// Demonstrate the program on the concept of Method Overriding

public class labPractice4 {
    void func1() {
        System.out.println("Inside the Function1 in labPractice4 class");
    }

    void func2() {
        System.out.println("Inside the Function2 in labPractice4 class");
    }
}
class msd extends labPractice4{
    void func3(){
        System.out.println("Inside the Function3 in msd class");
    }
    void func1(){
        System.out.println("Inside the Function1 in msd class Which is Overriding ");
        super.func1();
    }
    public static void main(String[] args) {

        msd m1 = new msd();
        m1.func1();
        m1.func2();
        m1.func3();

        
    }
}
