import java.util.Random;
import java.util.Scanner;

public class numberGuessing {

public static void play(Scanner keyboard) {

        int guessAttempt = 0;
        int guessedNumber = -1;
        int randomNumber = new Random().nextInt(100) + 1;

        System.out.println("Welcome to the guessing game v2.0!");

        while (guessedNumber != randomNumber) {
            utils.clearScreen();
            System.out.print("Enter a number between 1 to 100: ");
            String input = keyboard.nextLine();

            try {
                guessedNumber = Integer.parseInt(input);
                guessAttempt++;

                if (guessedNumber > randomNumber) {
                    System.out.println("Too High!");
                } else if (guessedNumber < randomNumber) {
                    System.out.println("Too Low!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input! Please enter a number.");
            }
        }

        System.out.println("You win after " + guessAttempt + " guesses!");
        System.out.println("The number was " + randomNumber + "\n");
    }
}
