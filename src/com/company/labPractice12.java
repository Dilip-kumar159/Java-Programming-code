package com.company;

class This{
    int i, j;
    This(){
        this(100);
    }
    This(int a){
        this(a,200);
    }
    This(int i, int j){
        this.i = i;
        this.j = j;
    }
    void display(){
        System.out.println("The Value of I is : " + i);
        System.out.println("The Value of J is : " + j);
    }
}
public class labPractice12 {
    public static void main(String[] args) {
        // Program to Demonstrate the 'This' Keyword
        This t = new This();
        t.display();
    }
}
