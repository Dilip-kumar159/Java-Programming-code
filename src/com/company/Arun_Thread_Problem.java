package com.company;
class hi extends Thread{
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class hello extends Thread{
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class Arun_Thread_Problem {
    public static void main(String[] args) {
        hi i = new hi();
        hello h = new hello();

        i.start();

        try {
            Thread.sleep(10);
        }
        catch (Exception e){
            System.out.println(e);
        }

        h.start();
    }
}
