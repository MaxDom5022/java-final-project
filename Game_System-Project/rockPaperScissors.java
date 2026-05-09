import java.util.Random;
import java.util.Scanner;

//this is the Subclass rockPaperScissors.java for game.java

public class rockPaperScissors extends game {
    public rockPaperScissors(){
        super("Rock, Paper, Scissors");

    }
    //Method Override
    public void start(){
        System.out.println("\nWelcome to Rock, Paper, Scissors!!! ");
        System.out.println("Are You ready to play !?!?!");


    }
    public void play(){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        String[] options = {"rock", "paper", "scissors"};
        String playAgain = "yes";

        //While loop
        while (playAgain.equals("yes")){

        
            System.out.println("Enter Rock, Paper, or Scissors: ");
            String userChoice = input.next().toLowerCase();

            String computerChoice = options[random.nextInt(3)];
            System.out.println("Computer chose: "+ computerChoice);

            //if statements
            if (userChoice.equals(computerChoice)){
                System.out.println("Its a tie!!!");

            }else if (userChoice.equals("rock") && computerChoice.equals("scissors") || userChoice.equals("paper") && computerChoice.equals("rock") || userChoice.equals("scissors") && computerChoice.equals("paper")){
                System.out.println("you win!!!");

            }else {
                System.out.println("Computer wins!");

            }

            System.out.println("Play again? (yes or no)");
            playAgain = input.next().toLowerCase();
        }

        end();
    }
   

}

