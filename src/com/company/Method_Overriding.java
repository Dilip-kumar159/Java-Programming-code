package com.company;
 class M{
     public void getX(){ // Method overriding as same as in Class N.
         System.out.println("X is called from Base class");
        }
 }
 class N extends M{
     @Override // Used Method overriding inorder to make it easy for user to know
     public void getX(){
         System.out.println("X is called from Derived class");
     }
 }
public class Method_Overriding {
    public static void main(String[] args) {
        M m = new M();
        m.getX();
        N n = new N();
        n.getX();

    }
}
