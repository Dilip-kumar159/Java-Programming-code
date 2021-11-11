package com.company;

@FunctionalInterface
interface myinterface{
   public void meth1();
//    public void meth2();  --> There should be only one method in the interface that should be ,
    //  abstract method which has no implementation.
}
class mphone extends Animal{
       @Override    //--> This is override annotation
    public void run() {
        System.out.println("Dog is running");
        }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class Annotations_In_Java {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        mphone mp = new mphone();
//        mp.run();
        mp.sum(43,4);
//        run r = new run();
//        r.sum(14,6);
    }
}
