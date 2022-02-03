package com.company;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

    }
    class CellPhone{
    public void ringing(){
            System.out.println("Ringing...");
        }
        public void vibrating(){
            System.out.println("Vibrating...");
        }
    }
    class Square{
    int side=5;
    public int area(){
        return side*side;
        }
        public int perimeter(){
        return 4*side;
        }
    }
    class Tommy{
    public void run(){
        System.out.println("Running towards the enemy");
    }
    public void hit(){
        System.out.println("Hitting on the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
    }



public class OOps_Problems {
    public static void main(String[] args){
        /*
       // Problem 1
        Employee ashutosh = new Employee();
        ashutosh.name="TraceMe";
        System.out.println(ashutosh.getName());
        ashutosh.salary=200000;
        System.out.println(ashutosh.getSalary());

        // Problem 2
        CellPhone call = new CellPhone();
        call.ringing();
        call.vibrating();


       // Problem 3
        Square square = new Square();
        square.side=5;
        System.out.println(square.area());
        System.out.println(square.perimeter());
        */
        // Problem 5
        Tommy player = new Tommy();
        player.run();
        player.hit();
        player.fire();


    }
}
