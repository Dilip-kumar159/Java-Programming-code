package com.company;

class furniture{
    int len, width;
    public void funcFur(){
        System.out.println("Length : " + len);
        System.out.println("Width : " + width);
    }
}
class chair extends furniture{
    int wheels;
    public void funcChair(){
        System.out.println("No. of wheels : " + wheels);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        chair c = new chair();
            c.len = 6;
            c.width = 4;
            c.wheels = 4;
            c.funcFur();
            c.funcChair();
    }
}
