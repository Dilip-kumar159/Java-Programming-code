package com.company;

class NegativeRadiusException extends Exception{
    public String toString(){
        return "Radius cannot be negative ";
    }
    public String getMessage(){
        return "Radius cannot be negative ";
    }
}
public class throw_and_throws_keyword {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a , int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        try {
            try {
                int c = divide(20, 5);
                double arr = area(6);
                System.out.println("the result is : " + c);
                System.out.println("the result is : " + arr);
            }
            catch (ArithmeticException e) {
                System.out.println("Failed , Result : " + e);
            }
        }
            catch (NegativeRadiusException e) {
                e.printStackTrace();
            }
        }
    }


