package com.company;

class cellPhone{
    void Call(){
        System.out.println("Calling Ishiii");
    }
}
interface GPU{
    void showLocation();
}
interface Camera{
    void clickPicture();
}
interface Player{
    void playMusic();
}
class SmartPhone extends cellPhone implements GPU, Camera, Player{
    public void showLocation(){
        System.out.println("Currently Untraceable...");
    }
    public void clickPicture(){
        System.out.println("You have got pretty face");
    }
    public void playMusic(){
        System.out.println("Music Played...");
    }

}
public class Interfaces_Prblm {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.Call();
        sp.showLocation();
        sp.clickPicture();
        sp.playMusic();
    }
}
