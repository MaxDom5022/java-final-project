import java.util.Random;
import java.util.Scanner;

//This is the subclass highLowCardGame.java

public class highLowCardGame extends game{
  Scanner input = new Scanner(System.in);

  public highLowCardGame (){
    super("High Low Card Game");
  } 

  //method override
  public void start(){
    System.out.println("\nWelcome to the High Low Card Game!");
     System.out.println("-----------------------------");
     System.out.println("Guess if the next card will be Higher (H) or Lower (L)!");
  }

  public void play(){
    Random random = new Random();
    String playAgain = "yes";

    // while loop
    while (playAgain.equals("yes")){
        int currentCard = random.nextInt(13) + 1;
        System.out.println("\nCurrent card: " + currentCard);
        System.out.print("Will the next card be Higher (H) or Lower (L)? ");

        String guess = "";
        //input
        while (!guess.equals("H") && !guess.equals("L")){
            try {
                guess = input.next().toUpperCase();
                if (!guess.equals("H") && !guess.equals("L")){
                    System.out.println("Invalid input. Enter H or L: ");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Enter H or L: ");
                input.nextLine();
            }
        }
        
        int nextCard = random.nextInt(13)+1;
        System.out.println("Next card: " + nextCard);

        if (nextCard > currentCard && guess.equals("H")){
            System.out.println("Correct! Higher!");

        }else if (nextCard < currentCard && guess.equals("L")){
            System.out.println("Correct! Lower!");

        }else if (nextCard == currentCard){
            System.out.println("It's a tie! No winner this round.");

        }else{
            System.out.println("Wrong!");
        }

        System.out.print("Play again? (yes/no): ");
        playAgain = input.next().toLowerCase();




    }
    end();
  }
}
   

    
