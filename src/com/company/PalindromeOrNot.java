package com.company;

import java.util.Scanner;

public class PalindromeOrNot {

    static char lowercase(char s){
        if(s >='a' && s <= 'z'){
            return s;
        }
        else{
            return (char) (s - 'A' + 'a');
        }
    }
    static boolean checkPalindrome(String s, int len) {
        int start = 0;
        int end = len - 1;
        while (start <= end) {
            if (lowercase(s.charAt(start)) != lowercase(s.charAt(end))) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();

        System.out.println("String is : " + name);

        int length = name.length();
        System.out.println("Palindrome or Not : " + checkPalindrome(name,length));

        System.out.println("Lower Case to Upper Case : " + lowercase('Z'));
    }
}
