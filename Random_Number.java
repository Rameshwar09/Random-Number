package project;
import java.util.*;
public class Random_Number {
	public static void main(String[] args) {
        // Generate a random number between 1 and 10
        int targetNumber = (int) (Math.random() * 10) + 1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 10:");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Read the user's guess
            int userGuess = scanner.nextInt();

            // Check if the guess is correct
            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Try again! The number is larger than " + userGuess);
            } else {
                System.out.println("Try again! The number is smaller than " + userGuess);
            }
        }
   }
}
