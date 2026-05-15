
import java.util.Scanner;

//this is the subclass trivia.java for game.java

public class trivia extends game{

    Scanner input = new Scanner(System.in);

    //Questions array
    String[] questions = {
        "Who Is on the $20 Dollar Bill?",
        "Where is our Nation's Capital located?",
        "What is the square root of 144",
        "Who is considered the King of Pop?",
        "Who Played Spiderman in The Amazing Spiderman 2",
        "Where is Richard Bland College Located in Virginia?"
    };

    // Answer Choices for each question
    String[] choice1 = {"A. Andrew Jackson", "B. Abraham Lincoln", " C. George Washington"};
    String[] choice2 = {"A. New York", "B. Washington D.C", " C. Virginia"};
    String[] choice3 = {"A. 12", "B. 14", " C. 16"};
    String[] choice4 = {"A. Prince", "B. Elvis Presley", " C. Michael Jackson"};
    String[] choice5 = {"A. Tom Holland", "B. Andrew Garfield", " C. Toby Maguire"};
    String[] choice6 = {"A. Prince George", "B. Richmond", " C. Colonial Heights"};

    //All Choices
    String[][] allChoices = {choice1, choice2, choice3, choice4, choice5, choice6};

    //Correct answers
    String [] correctAnswers = {"A", "B", "A", "C", "B", "A"};

    public trivia (){
        super("Trivia Game");

        
    }
    //Method Override
        public void start(){
            System.out.println("\nWelcome to the Trivia Game!");
            System.out.println("-----------------------------");
            System.out.println("Answer each question with A. B. or C.");

        }

        public void displayQuestion(String question, String[] choices){
            System.out.println("\n" + question);
            //for each loop
            for (String choice : choices){
                System.out.println(choice);
            
            }
        }

        public String userAnswer(){
            String answer = "";
            while(!answer.equals("A") && !answer.equals("B") && !answer.equals("C")){
                System.out.println("Select (A, B, C): ");
                try {
                    answer = input.next().toUpperCase();
                    if(!answer.equals("A") && !answer.equals("B") && !answer.equals("C")){
                        System.out.println("Invalid Input. Select (A, B, C): ");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Input. Select (A, B, C): ");
                    input.nextLine();
                }
            }
            return answer;
        }

        public boolean checkAnswer(String userAnswer, String correctAnswer){
            return userAnswer.equals(correctAnswer);
        }

        //Method Override
        public void play(){
            int correct = 0;
            int incorrect = 0;

            for (int i = 0; i < questions.length; i++){
                displayQuestion(questions[i], allChoices[i]);
                String userAnswer = userAnswer();
                if (checkAnswer(userAnswer, correctAnswers[i])) {
                    System.out.println("Correct!");
                    correct++;

                }else{
                    System.out.println("Incorrect. Correct Answer is" + correctAnswers[i]);
                    incorrect++;

                }

            }
            System.out.println("\n----- Final Score -----");
            System.out.println("Correct: " + correct);
            System.out.println("Incorrect: " + incorrect);
            end();
        }
}   