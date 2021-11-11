package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffer_reader_class {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 1;
        System.out.println("Enter the sum of digits ");
        int num = Integer.parseInt(bufferedReader.readLine());
        for (int i=0; i<num; i++){
            sum += i;
        }
        System.out.println("The sum of digits is : " + sum);
    }
}
