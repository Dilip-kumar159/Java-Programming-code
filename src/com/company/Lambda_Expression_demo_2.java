package com.company;

public class Lambda_Expression_demo_2{
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
//                    System.out.println(e);
                }
            }
        });
        Thread t2 = new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
//                    System.out.println(e);
                }
            }
        });
            t1.start();
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
            t2.start();
    }
}
