package com.company;

class InvalidInputException extends Exception{
    public String toString(){
        return "Adding of 8 and 9 is not allowed";
    }
}
class DivideByZeroException extends Exception{
    public String toString(){
        return "Divide by zero is not allowed";
    }
}
class MaxInputException extends Exception{
    public String toString(){
        return "Max Input is 100000";
    }
}
class MaxMultiplierException extends Exception{
    public String toString(){
        return "Max Input is 7000";
    }
}
class CustomCalc{
    double add(double a, double b) throws InvalidInputException , MaxInputException{
        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        else if (a>=100000){
            throw new MaxInputException();
        }
        return a+b;
    }
    double sub(double a, double b) throws MaxInputException{
        if (a>=100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double mul(double a, double b) throws MaxInputException, MaxMultiplierException{
        if(a<=7000 || b<=7000){
            throw new MaxMultiplierException();
        }
        else if (a>=100000){
            throw new MaxInputException();
        }
        return a*b;
    }
    double div(double a, double b) throws DivideByZeroException , MaxInputException{
        if(b==0){
            throw new DivideByZeroException();
        }
        else if (a>=100000){
            throw new MaxInputException();
        }
        return a/b;
    }
}
public class Custom_Calculator {
    public static void main(String[] args) throws InvalidInputException,DivideByZeroException ,MaxInputException, MaxMultiplierException{
            CustomCalc c = new CustomCalc();
//            c.add(8,9);
//            c.sub(900000 ,3);
//            c.mul(7001 ,3);
              c.div(43,0);
    }
}
