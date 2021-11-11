package com.company;

class My_Threads1 extends Thread{
    int i = 0;
    public void run() {
        while (i < 100) {
            System.out.println("Thread 1 is running ");
            i++;
        }
    }
}
class My_Threads2 extends Thread{
    int i = 0;
    public void run(){
        while (i < 100){
            System.out.println("Thread 2 is running ");
            i++;
        }
    }
}
public class Multi_Threads_In_Java {
    public static void main(String[] args) {
        My_Threads1 t1 = new My_Threads1();
        My_Threads2 t2 = new My_Threads2();
        t1.start();
        t2.start();
    }
}
