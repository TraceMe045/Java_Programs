package com.company;

public class Even_Odd_Sum {
    public static void main(String [] args){
        int [] a = new int[]{5,13,12};
        int odd = 0;
        int even = 0;
        for(int i = 0; i<=a.length-1; i++) {
            if (a[i] % 2 == 0) {
                even = even + a[i];
            }
            else
                odd = odd + a[i];
        }

        System.out.println("Sum of Odd No. :" +odd);

        System.out.println("Sum of Even No. :" +even);

    }
}
