package com.company;
import java.util.*;

public class Game {
    public static void main(String[] args) {

        //Rock Paper Scissor Game
        //rock = 0
        //paper = 1
        //scissor = 2

        int userInput;
        int computerInput;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissor");
        userInput=in.nextInt();

        Random random = new Random();
        computerInput = random.nextInt(3);

        if(userInput==computerInput) {
            System.out.println("Draw");
        }

            else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 ||
                userInput==2 && computerInput==1) {

            System.out.println("You Win!");
        }

                else{

                    System.out.println("Computer Win!");
                }
                if(computerInput==0)
        System.out.println("Computer's Choice : Rock");
                else if(computerInput==1)
                    System.out.println("Computer's Choice : Paper");
                else if(computerInput==2)
                    System.out.println("Computer's Choice : Scissor");
            }
        }








