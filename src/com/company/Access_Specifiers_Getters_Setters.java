package com.company;
    class Student{
        private int id;
        private String name;

        public int getId(){
            return id;
        }
        public void setId(int i){
             id = i;
        }
        public String getName(){
             return name;
        }
        public void setName(String n){
             name = n;
        }

    }
public class Access_Specifiers_Getters_Setters {
    public static void main(String[] args) {
        Student std = new Student();
//        std.id = 184; This will throw an error because variables are declared under private Modifier.
        std.setId(194);
        System.out.print("Student Id : ");
        System.out.println(std.getId());
        std.setName("Dilip v");
        System.out.print("Student Name : ");
        System.out.println(std.getName());
    }
}
