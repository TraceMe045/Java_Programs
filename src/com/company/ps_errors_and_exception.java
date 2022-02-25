package com.company;

import java.util.Scanner;
class maxRetryException extends Exception{
    public String getMessage(){
        return "Maximum retry reached!";
    }
}


public class ps_errors_and_exception{
    public static void main(String[] args) {

        //syntax error
        //System.out.println("where are u")
        //logical error(expected output 10, actual output -10)
        int a = -2;
        int b = 5;
        System.out.println(a * b);
        // runtime error
//        int a1 = 27;
//        int b1 = 0;
//        System.out.println(a1/b1);



        try {
            System.out.println(55 / 0);
        } catch (ArithmeticException e) {
            System.out.println("haha");
        } catch (IllegalArgumentException e) {
            System.out.println("hehe");
        }


            boolean flag = true;
            Scanner in = new Scanner(System.in);
            int input;
            int i = 0;
            int[] arr = new int[5];
            arr[0] = 15;
            arr[1] = 27;
            arr[2] = 72;
            arr[3] = 51;
            arr[4] = 1527;

            while (flag && i < 5) {
                try {
                    System.out.println("Enter the index number: ");
                    input = in.nextInt();
                    System.out.println("The value of entered index is " + arr[input]);
                    break;

                } catch (Exception ae) {
                    System.out.println("Invalid index!");
                    i++;
                }
            }
            if(i>=5){
               // System.out.println("Error");
                try {
                    throw new maxRetryException();
                }
                catch(maxRetryException e){
                    System.out.println(e.getMessage());
                }
            }
        }

    }

