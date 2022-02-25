package com.company;

class GoodMorning extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning!");
        }

    }
}
class Welcome extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome!");
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class Thread_Practice {
    public static void main(String[] args) {
        GoodMorning gm = new GoodMorning();
        Welcome w = new Welcome();
        gm.start();
        w.start();

    }
}
