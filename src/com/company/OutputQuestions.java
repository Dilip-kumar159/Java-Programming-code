package com.company;

public class OutputQuestions {
    public static void main(String[] args) {

        int count = 90;
        int ans = 10;
        System.out.println("" + (ans+(count++)));
        System.out.println("" +(ans+(++count)));
        System.out.println("" +(ans+(--count)));
        System.out.println("" +(ans+(count--)));

        System.out.println();
        int count1 = 90;
        System.out.println((ans+(count1++)) + " ");
        System.out.println((ans+(++count1)) + " ");
        System.out.println((ans+(--count1)) + " ");
        System.out.println((ans+(count1--)) + " ");

    }
}
