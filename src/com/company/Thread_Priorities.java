package com.company;

class MYthr1 extends Thread{
    public MYthr1(String name) {
        super(name);
    }
    public void run(){
        int i = 0;
        while (i < 10) {
            System.out.println("Name : " + getName());
            i++;
        }
    }
}
public class Thread_Priorities {
    public static void main(String[] args) {
        MYthr1 mt = new MYthr1("Dilip1 (Normal Priority)");
        MYthr1 mt2 = new MYthr1("Dilip2");
        MYthr1 mt3 = new MYthr1("Dilip3");
        MYthr1 mt4 = new MYthr1("Dilip4");
        MYthr1 mt5 = new MYthr1("Dilip5 (Max priority)");
        mt5.setPriority(Thread.MAX_PRIORITY);
        mt2.setPriority(Thread.MIN_PRIORITY);
        mt3.setPriority(Thread.MIN_PRIORITY);
        mt4.setPriority(Thread.MIN_PRIORITY);
        mt.setPriority(Thread.NORM_PRIORITY);

        mt.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();
    }
}
