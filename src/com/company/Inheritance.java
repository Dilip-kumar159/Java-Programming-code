package com.company;
class Base{
    int x;
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }
}
class Derived extends Base{
    int y;
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }
    public int sum(int x, int y){
        return x + y;
    }
}

class Animal{
    public void stare(){
        System.out.println("Dogs are Staring towards us!!!");
    }
    public void run(){
        System.out.println("Dogs are running towards the house!!!");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking at me!!!");
    }
    public void eat(){
        System.out.println("Dog is having a Pedigree!!!");
    }
}
public class Inheritance{
    public static void main(String[] args) {
//        Derived d = new Derived();
//        d.setX(20);
//        d.setY(30);
//        System.out.print("The value of X : ");
//        System.out.println(d.getX());
//        System.out.print("The value of Y : ");
//        System.out.println(d.getY());
//        System.out.print("The Sum of X and Y is : ");
//        System.out.println(d.sum(20,30));

        Dog d = new Dog();
        d.bark();
        d.eat();
        d.stare();
        d.run();
    }
}