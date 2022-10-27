//PROBLEM STATEMENT
// This is a number-guessing game that allows a user to choose a number at first. 
// Let the number guessed by the user be (x).
// The program generates a number (y).
// The objective of the game is to guess the number.
// If the number is :
// 1) x>y 
//   The program will indicate that the number to be guessed is less than the number guessed by the user.
// 2) x<y 
//  The program will indicate that the number to be guessed is greater than the number guessed by the user.
// 3) x=y 
//  The program will indicate that the number to be guessed is equal to the number guessed by the user.

// The player's score will be the number of tries taken to guess the correct number. 

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(200);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("LOW>>");
        }
        else if(inputNumber>number){
            System.out.println("HIGH<<<");
        }
        return false;
    }

}
public class number {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b= false;
        while(!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
        }

    }
}
