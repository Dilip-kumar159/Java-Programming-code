package com.company;

@FunctionalInterface
interface demoAnno{
    public void method1(int a);
//    public void method2();
}
//class dilipfunc implements demoAnno{
//
//    @Override
//    public void method1() {
//        System.out.println("Method 1 in normal class which implements the interface");
//    }
//
//    @Override
//    public void method2() {
//        System.out.println("Method 2 in normal class which implements the interface");
//    }
//}
//class me implements demoAnno {
//    public void method1(){
//        System.out.println("Method 1 in class me implements demoAnno");
//    }
//    public void method2(){
//        System.out.println("Method 2 in class me implements demoAnno");
//    }
//}
public class Anonymous_Lambda_Expression {
    public static void main(String[] args) {
//       demoAnno m = new me();
//        m.method1();
//        m.method2();
        // Anonymous class
//        demoAnno dm = new demoAnno() {
//            @Override
//            public void method1() {
//                System.out.println("Method 1 in Anonymous class ");
//            }
//
//            @Override
//            public void method2() {
//                System.out.println("Method 2 in Anonymous class ");
//            }
//        };
//            dm.method1();
//            dm.method2();

        // Lambda expression
//        demoAnno dm = new dilipfunc();
//        dm.method1();
//        dm.method2();
//
        demoAnno dm = (a) ->{
            System.out.println("Method 1 using lambda expression in main method " + a);
        };
        dm.method1(4);
    }
}
