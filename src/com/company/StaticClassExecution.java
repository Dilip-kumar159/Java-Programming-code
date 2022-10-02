package com.company;


public class StaticClassExecution {
    public static void main(String[] args) {
        DemoStaticClass dsc = new DemoStaticClass(20,"SDE1");
        DemoStaticClass.name = "DilipKumar";
        DemoStaticClass.print();

        System.out.println(DemoStaticClass.getName());
        System.out.println(dsc.getAge() + "\n" + dsc.getJob());
    }
}
