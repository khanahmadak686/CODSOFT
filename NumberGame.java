import java.util.Scanner;
import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        boolean playAgain = true;

        System.out.println("🎮 Welcome to Number Guessing Game!");

        while (playAgain) {

            // Step 1: Generate random number (1 to 100)
            int number = rand.nextInt(100) + 1;

            int attempts = 0;
            int maxAttempts = 5; // limit attempts
            boolean guessedCorrectly = false;

            System.out.println("\nGuess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            // Step 2, 3, 4: Guessing loop
            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("✅ Correct! You guessed the number.");
                    guessedCorrectly = true;
                    score++; // increase score
                    break;
                } else if (guess > number) {
                    System.out.println("📉 Too high!");
                } else {
                    System.out.println("📈 Too low!");
                }
            }

            // Step 5: If user fails
            if (!guessedCorrectly) {
                System.out.println("❌ Out of attempts! The number was: " + number);
            }

            // Step 6: Play again option
            System.out.print("\nDo you want to play again? (yes/no): ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        // Step 7: Display score
        System.out.println("\n🎯 Your final score (rounds won): " + score);
        System.out.println("Thanks for playing!");

        sc.close();
    }
}
