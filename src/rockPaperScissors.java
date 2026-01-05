import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {

       // ================= ROCK PAPER SCISSORS =================
    public static void play(Scanner keyboard) {

        Random random = new Random();

        String choice[] = {"rock", "paper", "scissors"};
        String playerChoice;
        String cpuChoice;
        String playAgain = "yes";

        do {
          
            System.out.print("Enter Your Move (rock, paper, scissors): ");
            playerChoice = keyboard.nextLine().toLowerCase();

            while (!playerChoice.equals("rock")
                    && !playerChoice.equals("paper")
                    && !playerChoice.equals("scissors")) {

                System.out.println("Invalid Choice");
                System.out.print("Enter Your Move (rock, paper, scissors): ");
                playerChoice = keyboard.nextLine().toLowerCase();
            }

            cpuChoice = choice[random.nextInt(3)];
            System.out.println("Computer's Choice: " + cpuChoice);

            if (playerChoice.equals(cpuChoice)) {
                System.out.println("It's a tie!");
            } else if (playerChoice.equals("rock") && cpuChoice.equals("scissors")
                    || playerChoice.equals("paper") && cpuChoice.equals("rock")
                    || playerChoice.equals("scissors") && cpuChoice.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = keyboard.nextLine().toLowerCase();

        } while (playAgain.startsWith("y"));

        System.out.println("Thanks for playing!");
    }

}