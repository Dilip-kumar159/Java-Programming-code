package com.company;


import java.util.LinkedList;

public class Advance_Java_Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(34);
        l1.add(32);
        l1.add(55);
        l1.add(89);
        l1.add(67);

        l1.addFirst(100); // element added in the first index that is 0.
        l1.addLast(500); // // element added in the last index that is size - 1

        l1.set(1,300);  // element at the first index will be replaced by 300.

        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(" ");
        }
    }
}
