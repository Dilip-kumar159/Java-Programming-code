package JavaArrayClasses;

public class swap {

    public static void main(String[] args) {

        int a = 10;

        int b = 20;

        System.out.println("Before Swapping : " + " a : " + a +  " b : " + b);

        // put a's Value in temp.
        int temp = a;

        // put b's value in a.
        a = b;

        // put temp's value in b
        b = temp;


        System.out.println("After Swapping : " + " a : " + a +  " b : " + b);



    }
}
