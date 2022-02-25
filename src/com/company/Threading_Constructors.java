package com.company;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
        System.out.println("I am a MyThread Constructor!");
    }
    public void run(){
        System.out.println("I am run method of Thread class!");
    }
}
public class Threading_Constructors {
    public static void main(String[] args) {
        MyThread mt = new MyThread("Ashutosh");
        mt.start();
        System.out.println("My class name is : "+mt.getName());

    }
}
