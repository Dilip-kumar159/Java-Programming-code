package com.company;

// program to demonstrate the types of constructor with in the class.
public class classConstructors {
    int feet;
    float inch;

    classConstructors(){
    feet = 10;
    inch = 2.3f;
    }
    classConstructors(int f , float i){
        feet = f;
        inch = i;
    }
    void print(){
        System.out.println("The value of feet : " + feet);
        System.out.println("The value of inch : " + inch);
    }

    public static void main(String[] args) {
        classConstructors d = new classConstructors();
        classConstructors d1 = new classConstructors(19,9.5f);
        d.print();
        d1.print();
    }
}
