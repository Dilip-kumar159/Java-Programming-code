package com.company;

import java.io.FileWriter;
import java.io.IOException;

//class mydeperecated{
//    @Deprecated
//    public void display(){
//        System.out.println("I'm a display method");
//    }
//}
interface mylambda{
    public void display();
}
public class Exercise_16_Advance_Java_02 {
//    @SuppressWarnings("deprecation")?  // In order to overcome this we use this warning method to avoid the warning.
    public static void main(String[] args) {
        // Problem 01 --> creating a class and @deprecated method
//        mydeperecated d = new mydeperecated();
//        d.display(); // display() gives proper output ,but only thing is it produce warning.

        // Problem 02 --> creating an interface and generating using anonymous and lambda expression.
//        mylambda l1 = new mylambda(){
//            @Override
//            public void display() {
//                System.out.println("This is a display method using anonymous class");
//            }
//        };
//
//        l1.display();
        // using lambda expression
//        mylambda l = () ->{
//            System.out.println("This is a display method using a Lambda Expression");
//        };
//        l.display();

        // Problem 03 --> Writing a file with multiplication table of 5,2,9
        int i =5;
        String table = "";
        for (int j=1; j<=10; j++){
            table += i + "X" + j + "=" + (i*j);
            table += "\n";
        }

        try {
            FileWriter fileWriter = new FileWriter("Multiplication_of_5.txt");
            fileWriter.write(table);
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        int i1 =19;
        String table1 = "";
        for (int j=1; j<=10; j++){
            table1 += i1 + "X" + j + "=" + (i1*j);
            table1 += "\n";
        }

        try {
            FileWriter fileWriter = new FileWriter("Multiplication_of_19.txt");
            fileWriter.write(table1);
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
