import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        Random random = new Random();
        
        String choice[] = {"rock", "paper", "scissors"};
        String playerChoice;
        String cpuChoice;
        String playAgain = "yes";

        do {
        System.out.print("Enter Your Move (rock, paper, scissors): ");
        playerChoice = scanner.nextLine().toLowerCase();

        
        // if input
        while (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
            
              System.out.println("Invalid Choice");
            System.out.print("Enter Your Move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();
        }

        // Computer Choice
        cpuChoice = choice[random.nextInt(3)];

        System.out.println("Computer's Choice: " + cpuChoice);

        // game logic

        if (playerChoice.equals(cpuChoice)) {

            System.out.println("It's a tie!");

        } else if (playerChoice.equals("rock") && (cpuChoice.equals("scissors")) 
                   || playerChoice.equals("paper") && cpuChoice.equals("rock")) {

            System.out.println("You win!");

        } else if (playerChoice.equals("scissors") && cpuChoice.equals("paper")) {

            System.out.println("You win!");

        } else {

            System.out.println("You lose!");

        } 

            System.out.print("Play again? (yes/no): ");

            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        System.exit(0);

        scanner.close();



        
    }
}
