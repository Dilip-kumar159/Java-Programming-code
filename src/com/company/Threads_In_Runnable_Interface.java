package com.company;

class My_Thread_runnable1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i < 400){
            System.out.println("Thread 1 in Runnable Interface ");
            i++;
        }
    }
}
class My_Thread_runnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("Thread 2 in Runnable Interface ");
            i++;
        }
    }
}

public class Threads_In_Runnable_Interface {
    public static void main(String[] args) {
        My_Thread_runnable1 bullet1 = new My_Thread_runnable1();
        Thread t = new Thread(bullet1);
        My_Thread_runnable2 bullet2 = new My_Thread_runnable2();
        Thread tr = new Thread(bullet2);
        t.start();
        tr.start();
    }
}
