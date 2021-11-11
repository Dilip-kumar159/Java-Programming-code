package com.company;

class exercise1 extends Thread{
    public void run(){
        int i = 0;
        while (i < 500) {
            System.out.println("Good Morning");
            i++;
        }
    }
}
class exercise2 extends Thread{
    public void run(){
        int i = 0;
        while (i < 500) {
            try {
                sleep(100);
            }
            catch ( InterruptedException e){
                System.out.println(e);
            }

            System.out.println("Welcome");
            i++;
        }
    }
}
public class Exercise_13 {
    public static void main(String[] args) {
        // problem 01
        // problem 02 --> just added a sleep() to slow down the execution in the class exercise 2.
        exercise1 e1 = new exercise1();
        exercise2 e2 = new exercise2();
        // Problem 03 --> just added a set priority() and a get Priority() in the same class
        e1.setPriority(6);
        e2.setPriority(10);
        // Problem 04 --> Added a get state(), inorder to check the state of a thread may be new or runnable or running.
        e1.getState();
        e2.getState();
        System.out.println(e1.getPriority());
        System.out.println(e2.getPriority());
        System.out.println(e2.getState());
        e1.start();
//        e2.start();
        System.out.println(e1.getState());
        // problem 05 --> Used a current Thread() because inorder to check the current status of the thread.
        System.out.println(Thread.currentThread().getState());
    }
}
