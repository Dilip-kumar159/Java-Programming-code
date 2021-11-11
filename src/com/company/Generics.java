package com.company;

import java.util.ArrayList;

class mgenerics<T1, T2>{
    int val;
    private  T1 t1;
    private  T2 t2;

    public mgenerics(int val, T1 t1, T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

//    public void setT1(T1 t1) {
//        this.t1 = t1;
//    }

    public T2 getT2() {
        return t2;
    }

//    public void setT2(T2 t2) {
//        this.t2 = t2;
//    }
}
public class Generics {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(42);
//        arrayList.add(78);
//        arrayList.add(89);
//        arrayList.add(83);
//
//        int a = (int) arrayList.get(0); // --> type caste is compulsory because it is not a generics.
//        System.out.println(a);

//        ArrayList<Integer> a = new ArrayList<>();  // This is a generics where there is no need of type-caste
//        a.add(78);
//        a.add(89);
//        a.add(83);
//        System.out.println(a.get(2));

        mgenerics<String , Integer> g = new mgenerics(23,"Dilip", 96);
        String str = g.getT1();
        Integer int1 = g.getT2();
        System.out.println(str + " " + int1 );
    }
}
