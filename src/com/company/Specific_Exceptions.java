package com.company;

import java.util.Scanner;

public class Specific_Exceptions {
    public static void main(String[] args) {
        int [] div = new int[3];
        div[0] = 10;
        div[1] = 15;
        div[2] = 27;

        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the array index  :");
        int ind = in.nextInt();
        System.out.println("Enter the number you want to divide the value with ");
        int num = in.nextInt();

        try{
            System.out.println("The number at the entered index: "+div[ind]);
            System.out.println("The result of array-value/number :"+div[ind]/num);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutofBoundsException occured!");
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occured!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
}
