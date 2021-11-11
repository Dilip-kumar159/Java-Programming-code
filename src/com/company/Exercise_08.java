package com.company;

    class Employee1{
        int salary;
        String name;

        public int getSalary(){
            return salary;
        }
        public String getName(){
            return name;
        }
        public void setName(String n){
            name = n;
        }
    }
       class cellphone{
        public void ring(){
            System.out.println("Ringing....");
           }
           public void vibrate(){
            System.out.println("Vibrating....");
           }

       }
       class Square{
        int side;
        public int area(){
            return side * side;
        }
        public int perimeter(){
            return 4 * side;
        }
       }
       class Rectangle{
        int len,wid;
        public int side(){
            return len * wid;
        }
        public int perimeter_of_rectangle(){
            return 4 * (len + wid);
        }
       }
       class Tommy{
        public void hit(){
            System.out.println("Hitting the enemy....");
        }
        public void run() {
            System.out.println("Running from the enemy....");

        }
        public void fire(){
            System.out.println("Firing towards the enemy....");
        }
       }

       class Circle{
       float pi = 3.14159f;
        float r;
        public float area(){
            return  pi * r * r;
        }
        public float perimeter(){
            return 2 * pi * r;
        }
       }
public class Exercise_08 {
    public static void main(String[] args){
        /*
//        Problem 01
        Employee1 e1 = new Employee1();
        e1.setName("Dilip");
        e1.salary = 45000;
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());

        // Problem 02
        cellphone samsung = new cellphone();
        System.out.println("The phone is ");
        samsung.ring();
        samsung.vibrate();

        // Problem 03
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // Problem 04
        Rectangle r =  new Rectangle();
        r.len = 4;
        r.wid = 2;
        System.out.printf("The side of the rectangle is %d \n",r.side());
        System.out.printf("The perimeter of the rectangle is %d ",r.perimeter_of_rectangle());

        // Problem 05
        Tommy t = new Tommy();
        t.fire();
        t.run();
        t.hit();
         */
        // Problem 06
        Circle c = new Circle();
        c.r = 4;
        System.out.println(c.area());
        System.out.println(c.perimeter());


    }
}
