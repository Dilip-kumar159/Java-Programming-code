package com.company;
    class myemployee{
        private int id;
        private String name;
        int salary;
        // Creating a constructor with no parameters.
        public myemployee(){
            name = "Dilip";
        }
        // constructor with parameters.
        public myemployee(String n, int i, int s){
            id = i;
            name = n;
            salary = s;
        }
        public String getName(){
            return name;
        }
        public int getId(){
            return id;
        }
        public int getSalary(){
            return salary;
        }
    }
public class Constructors {
    public static void main(String[] args) {
        myemployee dilip = new myemployee("Dililp V", 184,50000);
//        dilip.setId(134);
//        dilip.setName("CodeWithDilip");

        System.out.println(dilip.getId());
        System.out.println(dilip.getName());
        System.out.println(dilip.getSalary());
    }
}
