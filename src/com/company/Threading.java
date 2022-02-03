package com.company;
class Thread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i <4000){
            System.out.println("I am Thread 1");
            System.out.println("I am happy");
            i++;
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<4000){
            System.out.println("I am Thread 2");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class Threading {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();

    }
}
