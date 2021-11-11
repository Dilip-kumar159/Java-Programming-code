package com.company;

public class Methods {
    // Methods creation
//    static int sum(int a, int b)
//    {
//        int c=a+b;
//        return c;
//    }
    // object is passed not reference so the effect or changes is made in method won't affect .
     int sum(int a, int b)
    {
        int c;
        c = a+b;
       int x = 10; // There is no change in the output eventhough I changed x value in the method
        return c; // because x and y sends the copy of the object.

    }
    // reference is passed to method so can see the changes
    static void reference(int [] arr)
    {
       arr[0] = 45;
       arr[1]=34;
    }
    public static void main(String[] args) {
        int x=20;
        int y=20;
//     int z=sum(x,y) // Methods called directly not using the object of a class  because of static
      Methods m = new Methods();  // creating a object for class method
        int z = m.sum(x,y);
        System.out.println("The sum of x and y is : " + z);

        // Reference is passed to the method so whatever changes made in the method it affects.
        int [] marks = {90,70,50,49,83};
        reference(marks);
        System.out.println("The element in the marks is " + marks[0]);
        System.out.println("The element in the marks is " + marks[1]);
        // The marks[0] will be 45 not the 90 , because reference is passed.
        // The marks[1] will be 34 not the 70, as marks is a reference




    }

}
