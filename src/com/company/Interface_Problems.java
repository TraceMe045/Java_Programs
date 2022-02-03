package com.company;

interface SmartTvRemote {
    void TelevisionRemote();
}
interface TvRemote extends SmartTvRemote{
    void changeChannel();
    void getBack();
}
class Tv implements TvRemote{
    public void TelevisionRemote(){
        System.out.println("This is Television Remote...");
    }
    public void changeChannel(){
        System.out.println("Choose your channel wisely...");
    }
    public void getBack(){
        System.out.println("Press to get back to previous channel...");
    }
}

public class Interface_Problems {
    public static void main(String[] args) {
        TvRemote t = new Tv();
        t.changeChannel();
        t.getBack();

    }
}
