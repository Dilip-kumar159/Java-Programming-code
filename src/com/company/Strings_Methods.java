package com.company;

import java.util.Locale;

public class Strings_Methods {
    public static void main(String[] args) {
        String name = "Dilip";

        System.out.println(name.length()); // length of the string.
        System.out.println(name.toLowerCase(Locale.ROOT)); // Lower Case.
        System.out.println(name.toUpperCase(Locale.ROOT)); // Upper Case.

        String name1 = "       Malayalam     ";
        System.out.println(name1.trim()); // Trimming the spaces

        System.out.println(name.substring(3)); // note: indexes start from 0.
        System.out.println(name.substring(1,3)); // it excludes end character.

        System.out.println(name.replace('i','e')); // where i presents it replaces.
        System.out.println(name.startsWith("Di")); // it returns only boolean true or false.'
        System.out.println(name.endsWith("ip")); // same as startswith function but it returns end of the string.
        System.out.println(name.charAt(4)); // it shows at index which element is present in the string.

        System.out.println(name.indexOf("p")); // it returns either 1 for preset or -1 not present.
        // eg : string dilip , i is present in 1st index suppose p then it is in 4.
        System.out.println(name.indexOf("i",3)); // It starts from index 3 then it searches for i.
        System.out.println(name.lastIndexOf('i'));
        System.out.println(name.lastIndexOf("i",2)); // it starts before index 2
        System.out.println(name.equals("dilip")); // false because it is case sensitivity so need to give exact string.
        System.out.println(name.equalsIgnoreCase("dilip")); // it will ignore the case sensitivity.

        // Escape sequence Characters
          String letter = "From\n\t Dilip v\n\t degree college\n\t Bangalore ";
        System.out.println(letter);


    }
}
