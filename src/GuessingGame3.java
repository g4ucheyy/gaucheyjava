import java.util.Random;
import java.util.Scanner;

public class GuessingGame3 {

    public static void main(String[] args) {
            
       var scanner = new Scanner(System.in);

       int GuessAttempt = 0;
       int randomNumber = new Random().nextInt(100) + 1;

       System.out.println("Welcome to the guessing game v2.0!");
       System.out.println("Enter a number between 1 to 100: ");
       int GuessedNumber = scanner.nextInt(); 
       GuessAttempt++; // add amount of guess each wrong guesses is made

       while (GuessedNumber != randomNumber) {

            if (GuessedNumber > randomNumber) { // use if else statements for "too high/too low" system

         System.out.println("Too High!");

       } else {

        System.out.println("Too Low!");
       }
         


         System.out.println("Wrong guesses! Please try again...");
         System.out.println("Enter a number between 1 to 100: ");
         GuessedNumber = scanner.nextInt();
         GuessAttempt++;
       }

       scanner.close();

       System.out.println("You win after " + GuessAttempt + " guesses.");
       System.out.println("The number is " + GuessedNumber + ".");

    
       
       



    }

}
