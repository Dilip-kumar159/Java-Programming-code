package com.company;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // If-else condition statement or If-else-If ladder
        int age;
        System.out.println("Enter you are age ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age > 18) {
            System.out.println("You are eligible to drive a vehicle!");
        } else if (age == 18) {
            System.out.println("You can drive a vehicle through learning license!");
        }
        else
        {
            System.out.println("You are not eligible to drive!");
        }

        // Switch statements
        int day;
        System.out.println("Enter a number ");
        day = sc.nextInt();
//
//        switch (day)
//        {
//            case 1 :
//                System.out.println("Monday");
//                break;
//            case 2 :
//                System.out.println("Tuesday");
//                break;
//            case 3 :
//                System.out.println("Wednesday");
//                break;
//            case 4 :
//                System.out.println("Thursday");
//                break;
//            case 5 :
//                System.out.println("Friday");
//                break;
//            case 6 :
//                System.out.println("Saturday");
//                break;
//            case 7 :
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid number");
//        }

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid number");
        }

//        Logical Operators
        boolean a = true, b= false;

        // AND operator
        if (a && b) // if both are true then only it prints yes or else it is no.
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }

        // OR Operator
        if (a||b)  // if any one of the condition true than it is true
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

        // NOT Operator
        System.out.println(!(a&&b)); // a&&b will produce false if we use NOT operator then it is true.
        System.out.println(!(a||b)); // a||b will produce true if we use NOT opertor then it is false.
    }
}
