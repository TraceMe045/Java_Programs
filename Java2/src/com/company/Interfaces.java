package com.company;

interface Bicycle{
    //Any value assigned here is final.
    void speedUp(int increment);
    void applyBreak(int decrement);
}
class avon implements Bicycle{
    int speed= 10;
    public void speedUp(int increment){
        speed = speed + increment;
        System.out.println("New Speed: "+speed);
    }
    public void applyBreak(int decrement){
        speed = speed - decrement;
        System.out.println("After Break, New Speed: "+speed);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        avon a = new avon();
        a.applyBreak(5);
        a.speedUp(12);
    }
}
