// This is the MainMenu main class is for game.java

//importing scanner

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        //Games (Objects)
        guessTheNumber guessGame = new guessTheNumber();
        rockPaperScissors rpsGame = new rockPaperScissors();

        //while loop
        while (choice != 3) {
            System.out.println("\n Welcome to the RBC Game Hub");
            System.out.println("----------------------------");
            System.out.println("Please Select a game you would like to play:");
            System.out.println("1. Guess the Number");
            System.out.println("2. Rock, Paper, Scissors");
            System.out.println("3. Quit");

            choice = input.nextInt();

            //if statements
            if (choice == 1){
                guessGame.start();
                guessGame.play();

            }else if (choice == 2){
                rpsGame.start();
                rpsGame.play();

            }else if (choice == 3){
                System.out.println("Goodbye!!!");

            }else System.out.println("Invalid Choice, please enter 1. 2. 3.");



        }

    }

}


