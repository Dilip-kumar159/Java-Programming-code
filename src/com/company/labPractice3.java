package com.company;

// Demonstrate the program on Concept of Constructor Overloading

class dist{

    int feet, inch;

    dist(){
        feet = 10;
        inch = 20;
    }

    dist(int f, int i){
       this.feet = f;
       this.inch = i;
    }

    void display(){
        System.out.println("Feet : " + feet);
        System.out.println("Inch : " + inch);
    }
}
public class labPractice3 {

    int Feet , Inch;

    labPractice3(){
        Feet = 89;
        Inch = 23;
    }
    labPractice3(int f, int i){
        Feet = f;
        Inch = i;
    }
    void print(){
        System.out.println("Value of Feet : " + Feet);
        System.out.println("Value of Inch : " + Inch);
    }
    public static void main(String[] args) {
        dist d = new dist();
        System.out.println("Default Constructor");
        d.display();

        dist d1 = new dist(100, 200);
        System.out.println();
        System.out.println("Parameterized Constructor");
        d1.display();
        System.out.println();

        labPractice3 lp = new labPractice3();
        System.out.println("Inside the Class");
        lp.print();
        System.out.println();

        labPractice3 lp1 = new labPractice3(599,333);
        lp1.print();

    }
}
