
import java.util.Random;
import java.util.Scanner;


public class coinFlip {
    
     // ================= COIN FLIP =================
    public static void play(Scanner keyboard) {

        Random random = new Random();

        String playerChoice;
        String playAgain;

        System.out.println(utils.eq() + " Coin Flip " + utils.eq());

        do {
            utils.clearScreen();
            System.out.println("Choose Head or Tails: ");
            System.out.print("> ");
            playerChoice = keyboard.nextLine().toLowerCase();

            while (!playerChoice.equals("head") && !playerChoice.equals("tails")) {
                System.out.println("Invalid Choice");
                System.out.println("Choose Head or Tails: ");
                playerChoice = keyboard.nextLine().toLowerCase();
            }

            String coinResult = random.nextBoolean() ? "head" : "tails";
            System.out.println("Coin result: " + coinResult);

            if (playerChoice.equals(coinResult)) {
                System.out.println("You Win!");
            } else {
                System.out.println("You Lose!");
            }

            System.out.print("Play Again? (y/n): ");
            playAgain = keyboard.nextLine().toLowerCase();

        } while (playAgain.equals("y"));

        System.out.println("Thank You For Playing!");
    }

}
