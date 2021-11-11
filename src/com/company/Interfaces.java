package com.company;
interface Bicycle{
    int cycle = 7000;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface horn{  // There can be multiple interfaces and it should be implemented
    void applyhorn();
}
class Avonbicycle implements Bicycle , horn{  // class can implement both the interfaces.
    int speed = 7;
    public void applyBreak(int decrement){ // It is compulsory to add a public specifier to a function
        speed -= decrement;
        System.out.println(speed);
    }
    public void speedUp(int increment) { // It is compulsory to add a public specifier to a function
        speed += increment;
        System.out.println(speed);
    }
    public void applyhorn(){
        System.out.println("pee pee pee pee pu pu ");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Avonbicycle b = new Avonbicycle();
        b.applyBreak(3);
        b.speedUp(2);
        b.applyhorn();
       // b.cycle = 4300;// it is not possible to change the cycle cost because it is final, and  it is in interface.
        System.out.println(b.cycle);
        // interface can also refer to the object of the class
//        Bicycle b = new Avonbicycle();
//        b.applyBreak(3);
//        b.speedUp(2);
//        System.out.println(b.cycle);


//         horn h = new Avonbicycle();
//         h.applyhorn();
    }
}
