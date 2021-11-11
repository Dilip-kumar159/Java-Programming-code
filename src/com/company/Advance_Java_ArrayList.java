package com.company;

import java.util.*;

public class Advance_Java_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(); // for merging both the ArrayList l1 and l2.
        l1.add(23);
        l1.add(43);
        l1.add(78);
        l1.add(400);
        l1.add(98);
        l1.add(5,100); // for adding at the index 5.
        l1.add(0,40);
        l1.remove(3); // it removes element of index 3.

        l2.add(3000);
        l2.add(2000);
        l2.add(5000);
        l2.add(9000);
        l2.add(8000);
        System.out.println("Arraylist contains the element or not : " + l1.contains(100));
       // System.out.println("Arraylist contains the element or not : " + l1.contains(300));
        // l1.contains(100) is used to check whether the element is present or not and,
        // It returns boolean type --> true or false.
//        System.out.println("Before Merging");
//        l1.clear();
        l1.set(4,433); // It sets the value 433 at the index of 4.
        System.out.println("L1 ArrayList ");
        for (int i=0; i<l1.size(); i++) {
            System.out.print(" " + l1.get(i)); // get() method is used to print the arraylist
        }
        System.out.println();
        System.out.println("Index of the element 98 is : " + l1.indexOf(98));
        System.out.println("Index of first occurrence of an element 400 is : " + l1.indexOf(400));
        System.out.println("Index of last occurrence of an element 400 is : " + l1.lastIndexOf(400));
//        System.out.println("L2 ArrayList ");
//        for (int i=0; i<l2.size(); i++) {
//            System.out.print(" " + l2.get(i)); // get() method is used to print the arraylist
//        }
//        l1.addAll(l2);
//        l1.addAll(0,l2);
//        System.out.println();
//        System.out.println("After Merging");
//        for (int i=0; i<l1.size(); i++) {
//            System.out.print(" " + l1.get(i)); // get() method is used to print the arraylist
//        }
    }
}
