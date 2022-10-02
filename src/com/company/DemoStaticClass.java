package com.company;

public class DemoStaticClass {

    public static String name;
    public int age;
    public  String job;

    public DemoStaticClass(int age, String job) {
        this.age = age;
        this.job = job;
    }

    public static void print(){
        System.out.println("Static Function is called....");
    }
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        DemoStaticClass.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
