import java.util.Scanner;
import java.util.Random;


public class slotMachine {
    
    public static void play(Scanner keyboard) {
        
        Random random = new Random();
        int balance = 100;
        int bet;
        String[] symbols = {"$", "@", "#", "%", "&"};

        System.out.print(utils.logeq());
        System.out.println(" ***** SLOT MACHINE ******\n");
        System.out.println("Symbols: $ | @ | # | % | & ");
        System.out.println("Starting Balance: $" + balance);
        System.out.println(utils.logeq());

       while (balance > 0) {
        utils.clearScreen();

        System.out.print("Enter Your Bet (Place 0 To Quit): ");

        try {

                 bet = Integer.parseInt(keyboard.nextLine());

        } catch (NumberFormatException e) {

            System.out.println("Invalid Input! Please Enter A Number.");
            continue;

        } 
        
        if (bet == 0) {

            break; // player quits

        } else if (bet > balance) {

            System.out.println("Invalid bet! Current balance: $" + balance);
            continue;

        }

        // speeen
    
       System.out.print("Spinning...");

String reel1 = "";
String reel2 = "";
String reel3 = "";

for (int i = 0; i < 10; i++) { // number of spins
    reel1 = symbols[random.nextInt(symbols.length)];
    reel2 = symbols[random.nextInt(symbols.length)];
    reel3 = symbols[random.nextInt(symbols.length)];

    System.out.print("\rSpinning... " + reel1 + " | " + reel2 + " | " + reel3);

    try {
        Thread.sleep(200); // delay between spins
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
}

System.out.println("\n"); // move to next line

System.out.println(reel1 + " | " + reel2 + " | " + reel3 + "\n");



        if (reel1.equals(reel2) && reel2.equals(reel3)) {
            int payout = bet * 10;
            balance += payout;
            System.out.println("Jackpot! You win " + payout + "! Balance: " + balance);
        } else if (reel1.equals(reel2) || reel2.equals(reel3) || reel1.equals(reel3)) {
            int payout = bet * 2;
            balance += payout;
            System.out.println("Nice! You win " + payout + "! Balance: " + balance);
        } else {
            balance -= bet;
            System.out.println("You lose. Balance: " + balance);
        }

        // Game ends automatically if balance drops to 0
        if (balance == 0) {
            System.out.println("You ran out of coins! Game over.");
        }
    }

    System.out.println("Final balance: " + balance);



       }

      

       
        


    }


