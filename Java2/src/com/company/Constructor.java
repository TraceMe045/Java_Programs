package com.company;

class NewConstructor{
    int id;
    int salary;
    String name;


    public NewConstructor() {
        id = 45;
        name ="Rohiit";
    }
    public NewConstructor(int mySalary){
        salary=mySalary;
    }
   /*
    public void setId(int i){
      //  id = i;
    }
    */
    public int getId(){
        return  id;
    }
   /*
   public void setName(String n){
       // name = n;
    }
    */
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

}


public class Constructor {
    public static void main(String[] args) {
        NewConstructor constructor = new NewConstructor(20000);

        System.out.println(constructor.getSalary());



    }

}
