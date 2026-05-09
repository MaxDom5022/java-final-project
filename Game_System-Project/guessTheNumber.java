import java.util.Random;
import java.util.Scanner;

//this is the Subclass guessTheNumber.java for game.java

public class guessTheNumber extends game {
    public guessTheNumber(){
        super("Guess the Number");

    }
    // Method Override
    public void start(){
        System.out.println("\nWelcome to Guess the Number");
        System.out.println("-----------------------------");
        System.out.println("\nI have a number in mind that ranges from 1 to 100.");
    }
    
    public void play(){
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int hiddenNumber = random.nextInt(100) +1;
        int guess = 0;
        int attemps = 0;

        while (guess != hiddenNumber){
            System.out.println("Enter your guess: ");
            guess = input.nextInt();
            attemps++;

            if (guess < hiddenNumber){
                System.out.println("Your under the secret number! Try again");

            }else if (guess > hiddenNumber){
                System.out.println("Your over the secret number! Try again");

            }else{
                System.out.println("You Got it right!!! It took you " + attemps + "attempts!");

            }

        }
        
        end();

    }
}
