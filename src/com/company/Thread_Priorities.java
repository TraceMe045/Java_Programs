package com.company;

class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<2000){
            System.out.println("Hello "+this.getName());
            i++;
        }
    }
}
public class Thread_Priorities {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Ashutosh");
        MyThread1 t2 = new MyThread1("Ishiii");
        MyThread1 t3 = new MyThread1("TraceMe");
        MyThread1 t4 = new MyThread1("Untraceable");
        MyThread1 t5 = new MyThread1("Tokyo");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
