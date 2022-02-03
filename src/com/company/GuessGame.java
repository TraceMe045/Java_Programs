package com.company;
import java.util.*;
class myGame {
    Scanner in = new Scanner(System.in);
    public int userInput;
    public int computerInput;
    public int noOfGuesses = 0;

    /*
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

     */

    myGame() {

        Random random = new Random();
        computerInput = random.nextInt(100);

    }

    void takeUserInput() {
        System.out.println("Guess the number : ");
        userInput = in.nextInt();
    }

    boolean isCorrectAnswer() {
        noOfGuesses++;
        if (userInput == computerInput) {
            System.out.format("Yes, you guessed the right number.\n You guessed the number in %d attempts", noOfGuesses);
            return true;
        } else if (userInput < computerInput) {
            System.out.println("Too low...");
        } else if (userInput > computerInput) {
            System.out.println("Too High...");
        }

        return false;
    }

}
public class GuessGame {
    public static void main(String[] args){


        myGame game  = new myGame();
        boolean b =false;
        while(!b) {
            game.takeUserInput();
            b=game.isCorrectAnswer();
        }

    }
}
