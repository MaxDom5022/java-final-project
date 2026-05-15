

import java.util.Random;
import java.util.Scanner;

public class wordScramble extends game{


    Scanner input = new Scanner(System.in);

   String [] words = {"programming", "graduate", "variable", "finances", "commuter", "employed", "enrolled", "teaching", "mathematics", "physics"};

   public wordScramble (){
      super("Word Scramble");

   }

   // Method Override
   public void start(){
      System.out.println("\nWelcome to Word Scramble!");
      System.out.println("-----------------------------");
      System.out.println("Unscramble the word and type your answer.");

   }

   public String scrambleWord(String word){
      char[] letters = word.toCharArray();
      Random random = new Random();
      for (int i = letters.length - 1; i > 0; i--){
         int j = random.nextInt(i+1);
         char temp = letters[i];
         letters[i] = letters[j];
         letters[j] = temp;

      }

      return new String(letters);

   }
   public void play(){
      Random random = new Random();
      String playAgain = "yes";

      while ( playAgain.equals("yes")){
         String word = words[random.nextInt(words.length)];
         String scrambled = scrambleWord(word);

         System.out.println("\nScrambled word: " + scrambled);
         System.out.print("Your guess: ");
         
         try {
            String guess = input.next().toLowerCase();
            if (guess.isEmpty()){
               System.out.println("Invalid input, Enter a word.");
            }else if (guess.equals(word)){
               System.out.println("Correct! The word is " + word + "!");
            }else{ 
               System.out.println("Wrong! The word was " + word + ".");
            }
            
         } catch (Exception e) {
            System.out.println("Invalid Input.");
            input.nextLine();

         }

         System.out.print("Play again? (yes/no): ");
         playAgain = input.next().toLowerCase();

         
      }
      end();
   }
}
