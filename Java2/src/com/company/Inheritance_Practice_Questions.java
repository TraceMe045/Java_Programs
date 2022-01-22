package com.company;

class Circle{
    public int radius;
    Circle(){
        System.out.println("I am a non parameterized circle constructor!");
    }
    Circle(int r){
        System.out.println("I am a parameterized circle constructor!");
        this.radius =r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends  Circle{

    Cylinder1(int r, int h){
        super(r);
        System.out.println();
        this.height = h;
    }
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

class Rectangle1{
    public int length;
    public int breadth;
    Rectangle1(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    public int area(){
        return this.length*this.breadth;
    }

    //Getters and Setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
class Cuboid extends  Rectangle1{
    public int height;
    Cuboid(int l, int b, int h){
        super(l,b);
        this.height = h;
    }
    public int volume(){
        return this.length*this.breadth*this.height;
    }

    //Getters and Setters
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class Inheritance_Practice_Questions {
    public static void main(String[] args) {
        //problem 1
        /*
        Cylinder1 c = new Cylinder1(2 ,3);
        double result = c.volume();
        double areaResult = c.area();
        System.out.println("Volume of Cylinder: "+result);
        System.out.println("Area of Circle :"+areaResult);

         */
        //problem 2
        Cuboid cu = new Cuboid(2,3,4);
        int rectangleAreaResult = cu.area();
        int cuboidVolumeResult = cu.volume();
        System.out.println("Area of Rectangle: "+rectangleAreaResult);
        System.out.println("Volume of Cuboid: "+cuboidVolumeResult);


    }
}
