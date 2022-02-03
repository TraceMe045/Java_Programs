package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();


}

class subPen extends Pen{
    void write(){
        System.out.println("Your pen is Black");
    }
    void refill(){
        System.out.println("Your pen need not to be refilled!");
    }
}
class FountainPen extends Pen{
    void changeNib(){
        System.out.println("Latest feature in Fountain Pen");
    }
    void write(){
        System.out.println("Blue Pen");
    }
    void refill(){
        System.out.println("Refill your Pen!");
    }
}


public class Abstract_Problem1 {
    public static void main(String[] args) {
//        Pen p = new subPen(); --> performing polymorphism
//        p.write();
//        p.refill();

        FountainPen fp = new FountainPen();
        fp.changeNib();
        fp.refill();
        fp.write();
    }
}
