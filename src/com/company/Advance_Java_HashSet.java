package com.company;

import java.util.HashSet;

public class Advance_Java_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();
        h1.add(4);
        h1.add(3);
        h1.add(5);
        h1.add(7);
        h1.add(9);
        h1.add(3); // This element will be ignored

        System.out.println(h1);
//        h1.clear();
        h1.remove(5);
        System.out.println(h1);
        System.out.println(h1.size());  // This produces the size of the HashTable
        System.out.println(h1.isEmpty()); // This produce false as HashSet is not empty

        HashSet<Integer> h2 = new HashSet<>();
        System.out.println(h2.isEmpty()); // This produce true as HashSet is empty.
        System.out.println(h2.size());  // This produces the size of the HashTable

    }
}
