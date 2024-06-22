import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess what it is?");

        // Main game loop
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            numberOfTries++;

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number!");
                System.out.println("It took you " + numberOfTries + " tries.");
                hasGuessedCorrectly = true;
            }
        }

        input.close();
    }
}
