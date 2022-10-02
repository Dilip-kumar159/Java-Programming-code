package com.company;

class Rectangle1{
    int length , width;
    void displayRec(){
        System.out.println("The length of the Rectangle : " + length);
        System.out.println("The Width of the Rectangle : " + width);
    }
}
class square extends Rectangle1{
    int sides;
    void displaySquare(){
        System.out.println("The sides of the Square is " + sides);
    }
}
public class labPractice7 {
    public static void main(String[] args) {
        // Program to Demonstrate the Single Inheritance
        square s = new square();
        s.length = 10;
        s.width = 8;
        s.sides = 4;
        s.displayRec();
        s.displaySquare();
    }
}
