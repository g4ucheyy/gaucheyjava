/*
  * Author: Faris A.K.A Fries
  * Date: 27/12/2025
  * Version: 1.0
  */

import java.util.Scanner;

public class GameSuite {

    // ================= MAIN =================
    public static void main(String[] args) {

        var keyboard = new Scanner(System.in);
        String input;
        int select = 0;
        int gameSelect = 0;

        while (true) {

            do {
                System.out.println(utils.eq() + " GameSuite " + utils.eq());
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
                }
            } while (true);

            switch (select) {

                case 1:
                    System.out.println("""
                            Choose Game:

                            1.Number Guessing
                            2.Rock Paper Scissors
                            3.Coin Flip
                            4.Go Back
                            """);

                    System.out.print("> ");
                    input = keyboard.nextLine();

                    try {
                        gameSelect = Integer.parseInt(input);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Input! Please Enter A Number");
                        break;
                    }

                    switch (gameSelect) {
                        case 1 -> numberGuessing.play(keyboard);
                        case 2 -> rockPaperScissors.play(keyboard);
                        case 3 -> coinFlip.play(keyboard);
                        case 4 -> {}
                    }
                    break;

                case 2:
                    System.out.println(utils.eq() + " ABOUT " + utils.eq());
                    System.out.println("Developed by Gauchey");
                    System.out.println("Version: 1.0.1\n");
                    System.out.println(utils.logeq());
                    break;

                case 3:
                    System.out.println("Exiting Game");
                    try {

                        for (int i = 0; i < 3; i++) {
                            Thread.sleep(700);
                            System.out.print(".");
                        }
                        System.out.println();
                    } catch (InterruptedException e) {
                        
                        Thread.currentThread().interrupt();
                    }

                    System.exit(0);

                    break;

            }
        }
    }
}
