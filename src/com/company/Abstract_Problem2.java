package com.company;


class Monkey{
    void jump(){
        System.out.println("Jump Jump Jump...");
    }
    void Bite(){
        System.out.println("Bite Bite Bite...");
    }
}
interface BasicAnimals{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimals{
   public void eat(){
       System.out.println("Nothing new! EveryBody Eats...");
    }
    public void sleep(){
        System.out.println("Nothing new! EveryBody Sleeps...");
    }
}


public class Abstract_Problem2 {
    public static void main(String[] args) {
        Human h = new Human();
        h.jump();
        h.Bite();
        h.eat();
        h.sleep();
    }
}
