package com.company;

import java.util.Locale;

public class Exercise_03 {
    public static void main(String[] args) {
        // Problem 1
        String name = "DILIP KUMAR";
        name = name.toLowerCase(Locale.ROOT);
        System.out.println(name);

        // Porblem 2
        String word = "What is your name    ?";
        word = word.replace(" ", "_");
        System.out.println(word);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Dilip");
        System.out.println(letter);

        // Problem 4
        String Mystring = "This string contains  double and triple    spaces";
        System.out.println(Mystring.indexOf("  ")); // at the index 20 the double space consists.
        System.out.println(Mystring.indexOf("   ")); // at the index 39 the triple space consists.

        // Problem 5
        String letter2 = "Dear Dilip,\n\t The Java course is nice.\n\t Thanks!!";
        System.out.println(letter2);

    }

}
