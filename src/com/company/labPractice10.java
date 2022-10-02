package com.company;

class Answer implements Addition, Subtraction, Multiplication{
    int a = 20; int b = 10;
    public void add(){
        System.out.println("Addition of a and b is : " + (a+b));
    }
    public void sub(){
        System.out.println("Subtraction of a and b is : " + (a-b));
    }
    public void mul() {
        System.out.println("Multiplication of a and b is : " + (a*b));
    }
}

class Division extends Answer{
    int a = 10, b = 5;
    void div(){
        System.out.println("Division of a and b is : " + (a/b));
    }
}
class Modulo extends Answer{
    int a = 3 , b = 2;
    void mod(){
        System.out.println("Modulo of a and b is : " + (a%b));
    }
}
public class labPractice10 {
    public static void main(String[] args) {
        // program to Demonstrate the Hybrid inheritance
        Division d = new Division();
        d.add();
        d.sub();
        d.mul();
        d.div();
        System.out.println();
        Modulo m = new Modulo();
        m.add();
        m.sub();
        m.mul();
        m.mod();

    }
}
