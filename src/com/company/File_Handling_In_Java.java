package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling_In_Java {
    public static void main(String[] args) throws FileNotFoundException {
     /*   // Creating a new file
        File myfile = new File("Dilip.txt");
            try {
                myfile.createNewFile();
                System.out.println("File is created successfully!!");
            }
            catch (IOException e) {
                e.printStackTrace();
            }

            // Writing a file
        File myfile = new File("Dilip.txt");
            try {
                FileWriter fileWriter = new FileWriter("Dilip.txt");
                fileWriter.write("This is my first file writing in Java Programming , I'm really excited!! \n Thank you");
                System.out.println("File writing is succesfully completed!!");
                fileWriter.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        // Reading a file
        File myfile = new File("Dilip.txt");
        try {
            Scanner s = new Scanner(myfile);
            while (s.hasNextLine()){
                System.out.println(s.nextLine());
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        */
        // Deleting a file
        File myfile = new File("Dilip.txt");
        if (myfile.delete()){
            System.out.println("Dilip.txt file has been successfully deleted!!");
        }
        else{
            System.out.println("There is an issue while deleting a Dilip.txt file");
        }

    }
}
