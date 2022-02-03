package com.company;
class Method1{
    void A(){

        System.out.println("A Ashutosh Soni");

    }

}
class Method2 extends Method1{
    @Override
     void A(){

        System.out.println("Overriding here!..using Method 2");

    }
    void B(){
        System.out.println("Calling Method B");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Method2 m = new Method2();
        m.A();
        m.B();
    }
}
