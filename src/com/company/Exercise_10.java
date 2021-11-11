package com.company;

class my_circle{
    int radius;
    public int getRadius() {
        return this.radius;
    }
    my_circle(){
        System.out.println("I am a non-parameterized constructor in circle class");
    }
    my_circle(int radius){
        this.radius = radius;
        System.out.println("I'm a parameterized constructor");
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }
}
class mY_cylinder extends my_circle{
    int height;
    mY_cylinder(){
        System.out.println("I'm a non-parameterized constructor in cylinder class");
    }
    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    mY_cylinder(int radius , int height){
        super(radius); // as soon as super keyword present the control goes to the radius then starts executing from there.
        this.height = height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}
public class Exercise_10 {
    public static void main(String[] args) {
        // Problem 01
        mY_cylinder cy = new mY_cylinder(2,4);
        cy.setHeight(4);
        cy.setRadius(2);
        System.out.println(cy.getRadius());
        System.out.println(cy.area());
        System.out.println(cy.getHeight());
        System.out.println(cy.volume());
    }
}
