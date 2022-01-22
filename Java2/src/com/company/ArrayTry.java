package com.company;

import java.util.*;

public class ArrayTry {
    public static void main(String[] args){
       int [] sum={5,6,1,3,5};
       Scanner in = new Scanner(System.in);
        System.out.println("Enter the Element: ");
       int element = in.nextInt();
       boolean checkArray=false;
       for(int num:sum){
           if(element==num){
               checkArray=true;
               break;
           }
       }
       if(checkArray){
           System.out.println("Present");
       }
       else{
           System.out.println("not present");
       }




    }
}
