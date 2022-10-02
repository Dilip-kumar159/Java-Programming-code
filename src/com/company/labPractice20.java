package com.company;

import java.util.Vector;

public class labPractice20 {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add("C");
        v.add("C++");
        v.add("Java");
        v.add("J2EE");
        System.out.println("Initially Vectors are : " + v.toString());

        System.out.println("The Last Element : " + v.lastElement());

        System.out.println("The Element at 2nd position is : " + v.elementAt(2));

        v.insertElementAt("VB", 1);
        v.insertElementAt("C#",0);
        System.out.println("After Inserting Elements in Vectors " + v.toString());

        v.setElementAt("Kotlin",1);
        v.remove("VB");
        System.out.println("After Removing VB the elements in vectors are : " + v.toString());
    }
}
