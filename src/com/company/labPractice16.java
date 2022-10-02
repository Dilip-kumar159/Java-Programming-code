package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class labPractice16 {
    public static void main(String[] args) throws IOException {
        // Reverse a String and check whether the string is palindrome or not using scanner and buffered Reader

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String : ");
        String str = bufferedReader.readLine();
        String temp = str;

        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        str = stringBuffer.toString();
        System.out.println("The Reverse String is : " + str);

        if(temp.equalsIgnoreCase(str)){
            System.out.println(temp + " is a Palindrome");
        }
        else{
            System.out.println(temp + " is not a Palindrome");
        }


        // Optimized code
        System.out.println();
        checkPalindrome(temp);
        if(checkPalindrome(temp)){
            System.out.println(temp + " is a Palindrome");
        }
        else{
            System.out.println(temp + " is Not a Palindrome");
        }
    }

    public static char index(char c){
        if(c >= 'a' && c <= 'z'){
            return c;
        }
        else{
            return (char)(c - 'A' + 'a');
        }
    }
    private static boolean checkPalindrome(String temp) {
        int start = 0;
        int end = temp.length()-1;

        while(start <= end){
            if(index(temp.charAt(start++)) != index(temp.charAt(end--))){
                return false;
            }
        }
        return true;
    }


}
