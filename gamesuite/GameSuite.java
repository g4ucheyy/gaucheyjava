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
                    3.TicTacToe
                    4.Coin Flip
                    5.Math Quiz
                    6.Go Back
                    
                    """);

                    System.out.print("> ");
                    input = keyboard.nextLine();

                   try {

                    gameSelect = Integer.parseInt(input);

                    if (gameSelect < 1 || gameSelect > 6) {
                        System.out.println("Invalid Choice! Please Choose 1-6");
                    }

                   } catch (NumberFormatException e) {
                     
                    System.out.println("Invalid Input! Please Enter A Number");

                   }

                   switch (gameSelect) {

                    case 1:

                    numberGuessing(keyboard);
                  

                    break;

                    case 6:

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
                

            
        