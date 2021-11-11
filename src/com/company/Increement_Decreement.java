package com.company;

public class Increement_Decreement {
    public static void main(String[] args) {
        int a = 20;
        a++;
        System.out.println(++a);

        int b = 10;
        b--;
        System.out.println(--b);

        char ch = 'a';
        ch++; // 'a' is incremented using ascii value it incremented to b now.
        System.out.println(++ch); // now again 'a' is incremented now the value is c.

        char ch1 = 'a';
//        System.out.println(ch1++); // It prints 'a' according to ASCII value then it increments.
        System.out.println(++ch1); // It first increments then it prints 'b'.

    }
}
