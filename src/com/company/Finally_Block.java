package com.company;

public class Finally_Block {
    public static int division(){
        int a = 50;
        int b = 2;
        try {
            int c = a/b;
            return c;
        }

        catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("program is executed");
        }
        return -1;


    }
    public static void main(String[] args) {
        System.out.println(division());
        int x = 50;
        int y = 10;
        while(true){
            try {
                int z = x/y;
                System.out.println("The Result is : " + z);
            }
            catch (Exception e){
                System.out.println("Failed , Reason : " + e);
                break;
            }
            finally {
                System.out.println("Y is iterated till y value gets 0 : " + y);
            }
            y--;
        }

    }
}
