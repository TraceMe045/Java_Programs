package com.company;

public class Methods_Problem {
    static void multiplication(int n){
        int product=0;
        for(int i=1; i<=10; i++){
            product=n*i;
            System.out.println( product);

        }

    }
    static void pattern(int n){
        for(int i=0; i<n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+ sum(n-1);
        }
    }
    static void pattern1(int n){
        for(int i=0; i<n; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fib(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        //problem 1 : write a program in java for multiplication of any number using method.
       // multiplication(5);

       /*  problem 2: program to print * in right angle triangle form
        *
        * *
        * * *
        * * * *
       */
        //pattern(4);

        //problem 3: write a recursive function to print sum of first n numbers.
//         int c=sum(10);
//        System.out.println(c);

        //problem 4: write a program to print following pattern
//        ****
//        ***
//        **
//        *
        //pattern1(4);  not solved yet.

        //problem 5: write a function to print nth term of a fibonacci series using recursion.
        // 0,1,1,2,3,5,8,13,21,34...
        int result=fib(5);
        System.out.println(result);


    }
}
