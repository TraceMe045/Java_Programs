package com.company;

import java.security.spec.ECField;
import java.util.Scanner;

class myException extends Exception{
    public String toString(){
           return "I am toString()";
        }
    public String getMessage(){
            return "I am getMessage()";
        }
    }

public class Exception_Class {
    public static void main(String[] args){
        int a, b;
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter a and b:");
        a = in.nextInt();
        b = in.nextInt();

        if(a == 0 || b == 0) {
            try {
                throw new myException();
            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
