 /*
  * Author: Faris A.K.A Fries
  * Date: 27/12/2025
  * Version: 1.0
  */

 // future plan: local scoreboard

import java.util.Random;
import java.util.Scanner;

public class GameSuite {
  
// generic method
    public static String eq() {

        return "==========";
    }

    // core method

  public static void numberGuessing(Scanner keyboard) {

    int guessAttempt = 0;
    int guessedNumber = -1;
    int randomNumber = new Random().nextInt(100) + 1;

    System.out.println("Welcome to the guessing game v2.0!");

    while (guessedNumber != randomNumber) {
        System.out.print("Enter a number between 1 to 100: ");
        String input = keyboard.nextLine();

        try {
            guessedNumber = Integer.parseInt(input); // parse input once
            guessAttempt++; // count this as a single attempt

            if (guessedNumber > randomNumber) {
                System.out.println("Too High!");
            } else if (guessedNumber < randomNumber) {
                System.out.println("Too Low!");
            }
            // if equal, loop will exit
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input! Please enter a number.");
            // do not increment guessAttempt for invalid input
        }
    }

    System.out.println("You win after " + guessAttempt + " guesses!");
    System.out.println("The number was " + randomNumber + "\n");
}

public static void rockPaperScissors(Scanner keyboard) {


        
        Random random = new Random();
        
        String choice[] = {"rock", "paper", "scissors"};
        String playerChoice;
        String cpuChoice;
        String playAgain = "yes";

        do {
        System.out.print("Enter Your Move (rock, paper, scissors): ");
        playerChoice = keyboard.nextLine().toLowerCase();

        
        // if input
        while (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
            
              System.out.println("Invalid Choice");
            System.out.print("Enter Your Move (rock, paper, scissors): ");
            playerChoice = keyboard.nextLine().toLowerCase();
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

            playAgain = keyboard.nextLine().toLowerCase();

        } while (playAgain.startsWith("y"));

        System.out.println("Thanks for playing!");
        
}

// main
    public static void main(String[] args) {

        var keyboard = new Scanner(System.in);
        String input;
        int select = 0;
        int gameSelect = 0;

        while (true) {

    do {
        System.out.println(eq() + " GameSuite " + eq());
        System.out.println("""
                1.Play
                2.About
                3.Quit
                """);

        System.out.print("> ");
        input = keyboard.nextLine();

        try {
            select = Integer.parseInt(input);
            if (select < 1 || select > 3) {
                System.out.println("Invalid Choice! Enter 1-3\n");
                continue;
            }
         
        break;
        } catch (NumberFormatException e) {
          System.out.println("Invalid Input! Please Enter A Number.\n");
        } } while (true);
    
                switch (select) {

                    case 1:

                    System.out.println("""

                    Choose Game:

                    1.Number Guessing
                    2.Rock Paper Scissors
                    3.Slot Machine
                    4.Coin Flip
                    5.Go Back
                    
                    """);

                    System.out.print("> ");
                    input = keyboard.nextLine();

                   try {

                    gameSelect = Integer.parseInt(input);

                    if (gameSelect < 1 || gameSelect > 5) {
                        System.out.println("Invalid Choice! Please Choose 1-5");
                    }

                   } catch (NumberFormatException e) {
                     
                    System.out.println("Invalid Input! Please Enter A Number");

                   }

                   switch (gameSelect) {

                    case 1:

                    numberGuessing(keyboard);
                  

                    break;

                    case 2:

                    rockPaperScissors(keyboard);

                    case 5:

                    continue;

                 
                   }



                    break;

                    case 2:

                    System.out.println(eq() + " ABOUT " + eq());
                    System.out.println("Developed by Gauchey");
                    System.out.println("Version: 1.0\n");
                    
                    

                    break;

                    case 3:
                        System.out.println("Exiting Game");
                        try {
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".\n");
                        System.exit(0);
                        } catch (Exception e) {

                            System.out.println("Exiting System...");
                            System.exit(0);
                        }

                    break;

                    default:

                    break;

                }
            }
        }
        }
                

            
        