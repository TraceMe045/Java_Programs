package com.company;

class NegativeRadiusException extends Exception{
    public String toString(){
        return "Radius cannot be negative!";
    }
}

public class Throws {
    public static int divide(int a, int b) throws ArithmeticException{
        if(a <= 0 || b <= 0){
            throw new ArithmeticException();
        }
        int result = a/b;
        return result;
    }
    public static double area(double r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static void main(String[] args){
        try{
            int result = divide(5,0);
            System.out.println(result);

        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            double area = area(-3);
            System.out.println(area);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Program finished!");
        }
        System.out.println("Yes program finished!");


    }
}
