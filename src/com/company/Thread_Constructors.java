package com.company;

class MYthr extends Thread{
    public MYthr(String name) {
        super(name);
    }
    public void run(){
            System.out.println("Thread constructor");
        }
    }

public class Thread_Constructors {
    public static void main(String[] args) {
        MYthr mt = new MYthr("Dilip");
        MYthr mt2 = new MYthr("Kumar");
        mt.start();
        System.out.println("The Thread 1 ID is : " + mt.getId());
        System.out.println("The Thread 1 name is : " + mt.getName());

        System.out.println("The Thread 2 ID is : " + mt2.getId());
        System.out.println("The Thread 2 name is : " + mt2.getName());

    }
}
