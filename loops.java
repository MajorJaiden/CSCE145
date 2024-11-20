import java.util.Random;
import java.util.Scanner;

public class loops {

    public static final int max = 100;

    public static final void main(String[] args) {

        Scanner key = new Scanner(System.in);

        Random r = new Random();

        int secretNumber = r.nextInt(max);   // a number between 0-99

        System.out.println("I will pick a random number between 0 and 99. Can you guess it?");

        boolean correctGuess = false;

        while(correctGuess == false) {
            System.out.println("Enter your guess");

            int guess = key.nextInt();

            // input validation
            if (guess > 99 || guess < 0) {
                System.out.println("You entered an invalid number");
                System.exit(0);
            }

            if (guess < secretNumber) {
                System.out.println("Your guess is too low pick a larger value");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is too high pick a smaller value");
            } else if (guess == secretNumber) {
                System.out.println("Your guess is correct");
            } else {
                System.out.println("invalid input entered");
            }
        }

    }

}
