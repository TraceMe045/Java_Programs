package com.company;

class Library{
    String [] books;
    int n;
    Library(){
        this.books = new String[100];
        n=0;
    }

    void addBooks(String book) {
            this.books[n] = book;
            n++;
        System.out.println(book+" has been added!");
        }

    void showAvailableBooks(){
        System.out.println("Available books in the Library: ");
        for (String listBooks:this.books) {
            if(listBooks==null){
                continue;
            }
            System.out.println("* "+listBooks);
        }
    }
    void issueBooks(String book){
        for(int i =0; i<this.books.length; i++){
            if(this.books[i] == book){
                System.out.println(book+" has been issued!");
                this.books[i] = null;
                return;
            }

        }
        System.out.println("This book doest not exist in this library.");
    }
    void returnBooks(String book){

            addBooks(book);
        }

    }


public class OnlineLibrary {
    public static void main(String[] args) {
        Library l = new Library();
        l.addBooks("C++");
        l.addBooks("Competitive Programming");
        l.addBooks("Algorithm");
        l.addBooks("Java");
        l.addBooks("DSA");
        l.showAvailableBooks();
        l.issueBooks("Competitive Programming");
        l.showAvailableBooks();
        l.returnBooks("Competitive Programming");
        l.showAvailableBooks();

    }
}
