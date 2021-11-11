package com.company;
 // Creating my first custom class in java
class employee{
    int id;
    String name;
    int salary;
   public void display(){
        System.out.println("The id of the employee is " + id);
        System.out.println("The name of the employee is " + name);
    }
    public void getSalary(){
        System.out.println("The salary of the employee is " + salary);;
    }

}
public class First_Custom_Class {
    public static void main(String[] args) {
//        object is created and memory is allocated
        employee emp = new employee() ; // object 1 created
        emp.id = 222;
        emp.name="dilip";
        emp.salary = 30000;
        emp.display();
        emp.getSalary();

        employee john = new employee() ; // object 2 created
        john.id = 1325;
        john.name="John Joseph";
        john.salary = 100000;
        john.display();
        john.getSalary();
    }
}
