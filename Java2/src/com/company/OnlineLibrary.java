package com.company;
import java.util.*;

class Library{
    int n;
    String []availableBooks = new String[50];
    String issuedBooks [] = new String[50];
    Scanner in = new Scanner(System.in);

    void addBooks() {
        System.out.println("How many Books you want to Add?");
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Book Name:");
                availableBooks[i] =in.next();
        }
    }
    void issueBooks(){
        System.out.println("How many Books you have Issued?");
        n = in.nextInt();
        for(int i =0; i<n; i++){
            System.out.println("Book Name:");
            issuedBooks[i] = in.next();
        }
    }
    void returnBooks(){
        System.out.println("How many Books you want to return?");
        n = in.nextInt();
        for(int i=0; i<n; i++) {
            System.out.println("Returned Book Name(s): "+issuedBooks[i]);
        }

    }
    void showAvailableBooks(){
        System.out.println("Lists of Books Available in the Library:");
        for(int i = 0; i<n; i++){
            System.out.println(availableBooks[i]);
        }
    }

}

public class OnlineLibrary {
    public static void main(String[] args) {
        Library l = new Library();
        l.addBooks();
        l.issueBooks();
        l.returnBooks();

    }
}
