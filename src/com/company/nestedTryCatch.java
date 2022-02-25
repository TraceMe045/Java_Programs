package com.company;

import java.util.Scanner;

public class nestedTryCatch {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 61;
        a[1] = 36;
        a[2] = 56;
        a[3] = 62;
        a[4] = 16;
        Scanner in  = new Scanner(System.in);
        boolean flag = true;

        //Running program till user enters the right index number.
        while(flag) {
            System.out.println("Enter the index number: ");
            int num = in.nextInt();
            //nested Try Catch
            try {
                System.out.println("Trying nested Try Catch");
                try {
                    System.out.println(a[num]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist!");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
