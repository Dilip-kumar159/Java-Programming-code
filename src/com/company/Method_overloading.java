package com.company;

public class Method_overloading {
    // Method overloading where same name of the method that is area and different parameters.
    // Note--> if we change the return_type or data_type with same parameters then it will throw an error.
    // It is mandatory to change the parameters , parameters should not be same.
    static void area()
    {
        System.out.println("In the Below lines area of square and length and breadth of the rectangle can be seen");
    }
    static int area(int a)
    {
        return a*a;
    }
    static int area(int l, int b)
    {
        return l*b;
    }
    public static void main(String[] args) {
        int a=5;
        int l=3;
        int b=3;
        area();
        System.out.println("Area of Square is : " + area(a));
        System.out.println("Area of Square is : " + area(l,b));
    }
}
