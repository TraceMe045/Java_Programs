package com.company;

class MyThr1 extends Thread{
    public void run(){
        int i=0;
        while(i<1300){
            System.out.println("This is MyThr1 ");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                (e).printStackTrace();
            }
            i++;
        }
    }

}
class MyThr2 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("This is MyThr2 ");
            i++;
        }

    }
}
public class Threads_Methods {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1();
        MyThr2 t2 = new MyThr2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

        t2.start();

    }
}
