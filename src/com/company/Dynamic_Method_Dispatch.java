package com.company;

class Phone{
    public void ring(){
        System.out.println("Phone is ringing....");
    }
    public void on(){
        System.out.println("Switch on the Phone....");
    }
}
class Smartphone extends Phone{
   public void time(){
       System.out.println("The time is 8:00 am....");
   }
    public void on(){ // Method overriding on this Method.
        System.out.println("Switch on the Smart Phone....");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//        Superclass s = new Superclass();
//        s.on();
//        s.ring();
//        Subclass sc = new Subclass();
//        sc.on();
//        sc.ring();
//        sc.time();
        // Dynamic Method dispatch
        Phone s = new Smartphone(); // Super class is a reference,
        // subclass is an object with run time polymorphism
         s.ring(); // All the methods in the super class executes,
        // but whenever a method overriding is there that time object created that methods executes,
        // if and only when method is override.
         s.on();
//         s.time(); // This method is present in Subclass,
//         but it won't access because reference is from Super class
//         Smartphone sc = new Phone(); // This won't work because it is referenced Subclass,
//       object is created from Super class.
    }
}
