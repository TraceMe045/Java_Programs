package com.company;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        int [] group={15,27,16,21,40};
        System.out.println("Arrays in reverse order :");
        for(int i=group.length-1; i>=0; i-- ) {
            System.out.println(group[i]);
        }
        System.out.println("Arrays using for each loop :");
        for(int element:group)
        {
            System.out.println(element);
        }

         */
        /*
        //multidimensional array

        String [][] names;
        names = new String[2][3];
        names [0][0]="Ashutosh";
        names [0][1]="Shamser";
        names [0][2]="Monu";
        names [1][0]="Arshad";
        names [1][1]= "Ammar";
        names [1][2]= "Shabaz";

        for(int i=0; i<names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j]);
                System.out.print(" ");

            }
            System.out.println("");
        }

         */
        /*
        int s=0;
        int [] a = new int[5];

        System.out.println("Enter the 5 numbers :");
        for(int i=0; i<5; i++)
        {
            a[i]= in.nextInt();
        }
        for(int i=0; i<5; i++)
        {
            s=s+a[i];
        }
        System.out.println("sum : "+s);

         */

        int [] a = new int[10];
        for(int i=0; i<10; i++)
        {
            a[i] = in.nextInt();
        }
        for(int i=0; i<10; i++)
        {
            if(a[i]%2==0)
                System.out.println("Even num :"+a[i]);
        }
        for(int i=0; i<10; i++)
        {
            if(a[i]%2==1)
                System.out.println("Odd num :"+a[i]);
        }




    }
}
