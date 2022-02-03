package com.company;
// Implementing Runnable Interface to achieve Runnable Interface Threading.
class myRunnableThread1 implements Runnable{
    public void run(){
        int i =0;
        while(i<2000){
            System.out.println("Runnable Thread1");
            i++;
        }
    }
}
class myRunnableThread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<2000){
            System.out.println("Context-Switching");
            i++;
        }
    }
}
public class Threading_runnableInterface {
    public static void main(String[] args) {
        myRunnableThread1 m = new myRunnableThread1();
//        Thread thread1 = new Thread1(m);
        myRunnableThread2 t2 = new myRunnableThread2();
//        Thread thread2 = new Thread1(t2);

        new Thread(m).start();    // -- > running Runnable Interface's method.
        new Thread(t2).start();

    }
}
