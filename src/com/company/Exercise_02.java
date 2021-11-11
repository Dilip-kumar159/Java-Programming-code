package com.company;
import java.util.Scanner;
public class Exercise_02 {
    public static void main(String[] args) {
        // 1 Question
        float a = 7/4 * 9/2; // Answer is 4.0
        System.out.println(a);

        // variant of 1 question
        float b = 7/4.0f * 9/2.0f; // Answer is 7.875 as same as in calculator.
        System.out.println(b);

      // 2 Question
        // Encryption
        char grade = 'h';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // Decryption
        grade = (char) (grade - 8);
        System.out.println(grade);

        // 3 Question
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = s.nextInt();
        System.out.println(x>=10);

        // 4 Question
        int ab = 7 * 49/7 + 35/7; // Answer 54
        System.out.println(ab);


    }
}
