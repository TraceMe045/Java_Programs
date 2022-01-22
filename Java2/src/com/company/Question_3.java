package com.company;
import java.util.*;

public class Question_3 {
    public static void main(String[] args){
       /* WAP to input the monthly salary of a person and calculate his Annual Income Tax based on the table given below – Annual Salary Income Tax
                 Annual salary 						Income Tax
                <= Rs. 1,80,000 					Nil
                >Rs. 1,80,000 to Rs. 3,00,000 		Rs. 5000 + 13% of the amount
                >Rs. 1,80,000> Rs. 3,00,000 		Rs. 15,000 + 33% of the amount
                                                    Exceeding Rs. 3,00,000  */

        double sal, A_sal=0.0d, tax= 0.0d;
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the monthly Salary : ");
        sal = in.nextDouble();
        A_sal = sal* 12;
        if(A_sal >0 && A_sal <= 180000){
            tax =0.0;
        }
        else if(A_sal >180000 && A_sal <= 300000){
            tax = 5000 + ((A_sal*13)/100);
        }
        else {
            tax = 15000 + ((A_sal*33)/100);
        }
        System.out.println("Monthly Income : " +sal);
        System.out.println("Annual Salary : " +A_sal);
        System.out.println("Income Tax : " +tax);



    }
}
