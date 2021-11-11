package com.company;
class Library{
    String [] book;
    int no_of_books;
    Library(){
        this.book = new String[100];
        this.no_of_books = 0;
    }
    void add_book(String book){
        this.book[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added");
    }
    void show_Available_book(){
        System.out.println("Available books are : ");
        for (String book : this.book) {
            if(book == null){
                continue;
            }
            System.out.println(" * " + book);
        }
    }
    void issue_book(String book) {
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i].equals(book)) {
                System.out.println("The book has been issued");
                this.book[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }
      void return_book(String book){
        add_book(book);
      }
}

public class Library_Management {
    public static void main(String[] args) {
        Library l = new Library();
        l.add_book("Think and grow Rich");
        l.add_book("Algorithms");
        l.add_book("C++ and Java");
        l.show_Available_book();
        l.issue_book("Algorithms");
        l.show_Available_book();
         l.return_book("Algorithms");
         l.show_Available_book();

    }
}
