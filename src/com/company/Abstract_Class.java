package com.company;


abstract class parent{
    parent(){
        System.out.println("I'm a constructor in parent class");
    }
    abstract void greet(); // if there is any abstract method there should be abstract class,
    // and it can be overriding by its derived class in these case it is child class , there implementation is allowed
    abstract void greet1();
}
class child extends parent{
    @Override
    void greet() {
        System.out.println("Good Morning");
    }
    void greet1(){
        System.out.println("Good Afternoon");
    }
}
class child2 extends child{
    void greet2(){
        System.out.println("Good Night");
    }
}
public class Abstract_Class {
    public static void main(String[] args) {
//        parent p = new parent();  --> throws an error because parent class is a abstract class and object cannot be created.
//        child c = new child();
//        c.greet();
//        c.greet1();
        parent p = new child(); // This is possible an abstract class can be a reference to the concrete class object.
        p.greet();
        p.greet1();
//        child2 cc = new child2();
//        cc.greet2();
    }
}
