package com.company;

abstract class PhoneModel{
    abstract void Switchoff();
}
class PocoX3 extends PhoneModel{
    @Override
    void Switchoff(){
        System.out.println("Your Phone is Switching Off!");
    }
}
class Jio extends PocoX3{
    void Calling(){
        System.out.println("Calling Mummy!");
    }
}
public class AbstractMethods_Classes {
    public static void main(String[] args) {
        Jio j = new Jio();
        j.Calling();
        j.Switchoff();

    }
}
