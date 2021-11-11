package com.company;

public class Operator_Precedence {
    public static void main(String[] args) {
//        Airthmetic operators
        int a = 20;
        int b = 20;
        int c = 30;
//        int result = a + b + c;
//        int result = a - b - c;
//        int result = a * b * c;

//        Comparison operator;
        System.out.println(a==b && b==c);
        System.out.println(a==b || b==c);

//        Quick Quiz
        int x = 20;
        int y = 10;
//        int res = (x-y)/2;

        int res = b*b - (4*a*c)/(2*a);
        System.out.println(res);

        int v = 20;
        int u = 10;
        int z = v*v - u*u;
        System.out.println(z);

        int q = a * b - c;
        System.out.println(q);
    }
}
