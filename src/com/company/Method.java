package com.company;

public class Method {
    static int add(int ...arr){
        int result=0;
        for(int a:arr){
            result +=a;
        }
        return result;
    }
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
        static int factorial_iterative(int m){
            int product=1;
            if(m==0 || m==1){
                return 1;
            }
            else{

                for(int i=1; i<=m; i++){
                     product *=i;
                }
            }

            return product;

    }

    public static void main(String[] args){
//        int z,x=5,y=3;
//        z=add(x,y);
//        System.out.print(z);
    //    System.out.println("Sum of nothing : "+add() );
        int x=4;
        System.out.println("The factorial of 4 is : "+factorial_iterative(x));

    }
}
