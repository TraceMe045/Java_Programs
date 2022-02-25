package com.company;

public class try_program {
    public static void main(String args[]){
        int a = 75000;
        int b = 0;

        //trying to execute the logic. if found exception ,catching the exception and allowing the remaining codes to execute.
        try{
            int c = a/b;
            System.out.println("The result after dividing :"+c);
        }catch(Exception e){
            System.out.println("Division failed. Reason: ");
            System.out.println(e);
        }


        System.out.println("The program comes to end here!");
    }
}
