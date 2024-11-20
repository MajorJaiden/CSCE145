//Jaiden Major
import java.util.Scanner;
import java.util.Random;
//Random so the computer randomly picks
public class Homework3 {

    public static void main (String [] args) {
        while (true){
            Scanner key = new Scanner(System.in);

            String[] rockPaperScissors = {"Rock", "Paper", "Scissors"};
            //create rockpaperscissors string
            String computerMove = rockPaperScissors[new Random().nextInt(rockPaperScissors.length)];
            //makes computer move equal to roock,paper,or scissors
            String playerMove;
            while (true)
            {
                System.out.println("Enter Rock, Paper, or Scissors:");
                playerMove = key.nextLine();
                //input validation
                if (playerMove.equalsIgnoreCase("rock") || playerMove.equalsIgnoreCase("paper") || playerMove.equalsIgnoreCase("scissors"))
                {
                    break;
                }
                System.out.println("invalid input");
            }
            System.out.println("Computer played: " + computerMove);
            //had to go back and add IgnoreCase
            //all game outcomes  |
            //                   V
            if (playerMove.equalsIgnoreCase(computerMove))
            {
                System.out.println("The game was a tie");
            }
            else if (playerMove.equalsIgnoreCase("rock"))
            {
                if (computerMove.equalsIgnoreCase("paper"))
                {
                    System.out.println("you lose!");
                }
                else if (playerMove.equalsIgnoreCase("scissors"))
                {
                    System.out.println("you win!");
                }
            }

            else if (playerMove.equalsIgnoreCase("paper"))
            {
                if (computerMove.equalsIgnoreCase("rock")) {
                    System.out.println("you win!");
                }
                else if (playerMove.equalsIgnoreCase("scissors")) {
                    System.out.println("you lose!");
                }
                else if (playerMove.equalsIgnoreCase("scissors")) {
                    if (computerMove.equalsIgnoreCase("paper")) {
                        System.out.println("you win!");
                    }
                    else if (playerMove.equalsIgnoreCase("rock")) {
                        System.out.println("you lose!");
                    }

                }
            }
            //ask to play again
        System.out.println("Do you want to play again?");
            String playAgain = key.nextLine();
            if (!playAgain.equalsIgnoreCase("yes"))
            {
                break;
            }
        }
    }
}
