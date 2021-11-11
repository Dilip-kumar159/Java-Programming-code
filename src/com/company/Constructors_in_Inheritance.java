package com.company;

class Base1{
    Base1(){
        System.out.println("Base class constructor is called");
    }
    Base1(int x){
        System.out.println("Base class constructor overloading called and value of x is : " + x);
    }
}
class Derived1 extends Base1{
    Derived1(){
//        super(5); // as soon as the control reaches the super keyword then,
        // it will fetch the desired constructor and executes it , after executing controls comes back.
        System.out.println("Derived class constructor is called");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("Derived class constructor overloading is called and the value of y is " + y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived() {
        System.out.println("Child of derived class constructor is called");
    }
    ChildOfDerived(int x, int y, int z) {
        super(x,y);
        System.out.println("Child of derived class constructor overloading is called and the value of z : "+z);
    }
}
public class Constructors_in_Inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(10,20);
        ChildOfDerived c = new ChildOfDerived(10,20,30);

    }
}
