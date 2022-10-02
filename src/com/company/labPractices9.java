package com.company;

class book{
    String title, author;
    void displayBook(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }
}
class publication extends book{
    String publisherName;
    int publishedYear;
    void displayPublication(){
        System.out.println("Publisher Name : " + publisherName);
        System.out.println("Published Year : " + publishedYear);
    }
}
class volume extends publication{
    int volumes , pages;
    void displayVolume(){
        System.out.println("Volume : " + volumes);
        System.out.println("Number of Pages : " + pages);
    }
}
public class labPractices9 {
    public static void main(String[] args) {
        // Program to Demonstrate the concept of Multi-level Inheritance
        volume v = new volume();
        v.title = "Java Programming";
        v.author = "Srikanth";
        v.publisherName = "Skyward";
        v.publishedYear = 2021;
        v.volumes = 500;
        v.pages = 350;
        v.displayBook();
        v.displayPublication();
        v.displayVolume();
    }
}
