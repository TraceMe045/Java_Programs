package com.company;

class Base{
    int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("From the base class");
        this.x=x;
    }

    public Base(){
        System.out.println("this is base class constructor");
    }
    public Base(int x){
        System.out.println("this is overloaded base class constructor and value of x: "+x);
    }
}
class derived extends Base{
    int y;

    public int getY() {
        return y;
    }
    public void setY(int y){
        System.out.println("From the derived class");
        this.y=y;
    }
    public derived(){
        System.out.println("this is derived class constructor");
    }
    public derived(int x, int y){
        super(x);
        System.out.println("this is overloaded derived class constructor and value of y :" +y);
    }
}

public class Inheritance_and_constructor {
    public static void main(String[] args){

        derived d = new derived(45,27); // parameters used here are calling constructor in inheritance

        // calling classes using inheritance
        d.setX(15);
        System.out.println(d.getX());
        d.setY(45);
        System.out.println(d.getY());


    }
}
