package com.company;

public class Array_Problems {
    public static void main(String[] args) {
        //problem 1: array of 5 floats and find their sum
      /* int [] sum={10,10,10,10,10};
        int add=0;

        for(int element:sum ){
            add=element+add;
        }
        System.out.println("Sum of Numbers " +add);

        // problem 2: check whether a number is present in an array or not
        int [] numbers={15,10,30,40,35};
        int num= 30;
        boolean checkArray=false;
        for(int element:numbers){
            if(num==element){
                checkArray=true;
                break;
            }
        }
            if(checkArray){
                System.out.println("Number is present in array");
            }
            else{
                System.out.println("Number is not present in array");
            }

        // problem 3 : calculate the average marks of students of physics from an array
        int [] marks={70,60,45,80,33,46,44,50,63,38};
        int avg=0;
        System.out.println("Length of marks: " +marks.length);
        for(int element:marks){
            avg=(avg+element);

        }
        avg=avg/marks.length;
        System.out.println("Average Marks :" +avg);

        // problem 4 : add two matrices of size 2*3
        int [] [] mat1={{1,2,3}, {4,5,6}};
        int [] [] mat2={{7,8,9}, {9,8,6}};
        int [] [] result={{0,0,0}, {0,0,0}};

        for(int i=0; i<mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                System.out.print(result[i][j]+" ");
                result[i][j]= mat1[i][j]+mat2[i][j];
            }
            System.out.println("");
        }

        // problem 5 : reverse the array in java
        int [] num={2,3,4,5,8,6};
        int l=num.length;
        int arr=Math.floorDiv(l, 2);
        int temp=0;


        for(int i=0; i<arr; i++){
            temp=num[i];
            num[i]=num[l-i-1];
            num[l-i-1]=temp;
        }
        for(int element:num){
            System.out.print(element +" ");
        }


        // problem 5: find the maximum number in array
        int [] num={10,3,18,7,6};
        int max=0;
        for (int element:num) {
            if(element>max) {
                max = element;
            }
        }
        System.out.println(max);
       */
         // problem 7: check whether array is sorted or not
        int [] sort={15,20,300,40};
        boolean issort=true;
        for(int i=0; i<sort.length-1; i++){
            if(sort[i]>sort[i+1]){
                issort=false;
                break;
            }
        }
        if(issort){
            System.out.println("array is in sorted form");
        }
        else{
            System.out.println("array is not in sorted form");
        }







    }

}


