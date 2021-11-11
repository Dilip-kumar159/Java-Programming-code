package com.company;
class c1{
    public int x = 20;
    private int y = 40;
    protected int z = 89;
    int a = 34;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class Access_Modifiers {
    public static void main(String[] args) {
        c1 c = new c1();
        // public access modifier
        c.meth1();
    }
}
