package com.company;

import java.util.ArrayDeque;

public class Advance_Java_Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(100);
        ad1.add(200);
        ad1.add(300);
        ad1.add(400);
        ad1.add(500);

        ad1.addFirst(900); // adding first at index 0.
        ad1.offerFirst(800);

        ad1.addLast(100); // added at the last
        ad1.removeLast();
        ad1.removeFirst();
        ad1.pollFirst();
        ad1.pollLast();
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

    }
}
