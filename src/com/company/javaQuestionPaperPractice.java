package com.company;

public class javaQuestionPaperPractice {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        if(a == b)
//            System.out.println("Both are equal");
//        else
//            System.out.println("Both are not equal");

        // for loop
        System.out.println("For loop");
        for(int i=1; i<=10; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();

        // while Loop
        System.out.println("While Loop");
        int i = 1;
        while(i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Do while Loop
        int a = 1;
        System.out.println("Do - while Loop");
        do {
            System.out.print(a + " ");
            a+=3;
        }while (a >= 10);
    }
}
