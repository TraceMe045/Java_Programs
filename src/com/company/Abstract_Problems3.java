package com.company;

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    void ring(){
        System.out.println("Ringing....");
    }
    void lift(){
        System.out.println("Lifting...");
    }
    void disconnect(){
        System.out.println("Disconnected...");
    }
    void Camera(){
        System.out.println("Taking snap");
    }
    void GPS(){
        System.out.println("Showing your current location.");
    }
}

public class Abstract_Problems3 {
    public static void main(String[] args) {
        Telephone t = new SmartTelephone(); // --> performing Polymorphism
//      t.Camera(); --> throws an error because I am taking reference of Telephone class which does not have this method.
        t.ring();
    }
}
