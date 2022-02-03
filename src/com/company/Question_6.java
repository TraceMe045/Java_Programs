package com.company;

import java.util.*;

public class Question_6 {

    //to input two digit number and display the sum and product of digits.

    public static void main(String[] args) {
        int n,r,s=0,p=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        n = in.nextInt();
        while (n!=0){
         r=n%10;
         s=s+r;
         p=p*r;
         n=n/10;

        }
        System.out.println("Sum = "+s);
        System.out.println("Product = " +p);

    }
}
