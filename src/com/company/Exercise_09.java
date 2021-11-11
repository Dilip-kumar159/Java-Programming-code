package com.company;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius){
       this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public float surfaceArea(){
        return (float) (2 * Math.PI * radius * height + 2 * Math.PI * radius * radius);
    }
    public float volume(){
        return (float) (Math.PI * radius * radius * height);
    }
}

 class My_rectangle{
    private int length;
    private int breadth;

    public My_rectangle(){
        int length = 4;
        int breadth = 5;
    }

     public int getLength() {
         return length;
     }

     public int getBreadth() {
         return breadth;
     }

     public My_rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int sideOfRectangle(){
        return length * breadth;
    }
}

class Sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public Sphere(int radius) {
        this.radius = radius;
    }
    public float surfaceArea(){
        return (float) (4 * Math.PI * radius * radius);
    }
    public float volume(){
//        return (float) ( 4.0/3.0 * Math.PI * radius * radius * radius);
        return (float) ((float) 4/3 * Math.PI * radius * radius * radius);
    }
}
public class Exercise_09 {
    public static void main(String[] args) {
        /*
        // Problem 01(Getters and Setters)
        // Problem 02(Calculating the surface area and volume of the cylinder)
        // problem 03(same problem 01 and problem 02 using constructors)
        Cylinder c = new Cylinder(12 , 9);
//        c.setHeight(9);
//        c.setRadius(12);
        System.out.print("Enter Height of the Cylinder is : ");
        System.out.println(c.getHeight());
        System.out.print("The Height of the Cylinder is : ");
        System.out.println(c.surfaceArea());
        System.out.print("Enter Radius of the Cylinder is : ");
        System.out.println(c.getRadius());
        System.out.print("The Radius of the Cylinder is : ");
        System.out.println(c.volume());

        // Problem 04
        My_rectangle r = new My_rectangle(4,5);
        System.out.print("Height : ");
        System.out.println(r.getLength());
        System.out.print("Breadth : ");
        System.out.println(r.getBreadth());
        System.out.print("Side of the Rectangle : ");
        System.out.println(r.sideOfRectangle());
           */
        // Problem 05
        Sphere sp = new Sphere(4);
//        sp.setRadius(4);
        System.out.print("Enter the radius of the sphere : ");
        System.out.println(sp.getRadius());
        System.out.print("The surface of the sphere : ");
        System.out.println(sp.surfaceArea());
        System.out.print("The volume of the sphere : ");
        System.out.println(sp.volume());

    }
}
