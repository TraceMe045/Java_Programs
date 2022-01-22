package com.company;

class Cylinder{
    private int radius;
    private int height;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius=r;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
class Rectangle{
    int height;
    int breadth;

    public Rectangle(int height, int breadth){
        this.height=height;
        this.breadth=breadth;
    }
    public int getHeight(){
        return height;
    }
    public int getBreadth(){
        return breadth;
    }
}

public class ConstructorAndAccess_Prblm {
    public static void main(String[] args){

        Cylinder myCylinder = new Cylinder();
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());

        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        Rectangle r = new Rectangle(4,5);
        System.out.println(r.getHeight());
        System.out.println(r.getBreadth());


    }
}
