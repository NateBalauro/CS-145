//Name: Nathaniel Balauro
//CS & 145 
//Assingment: Lab 1: Guessing Game
//Purpose: Updates and improves a previously created lab that creates
//         an interactive guessing game to play with a user.
import java.util.Scanner; // imports scanner from the library
import java.util.Random; // imports the random number

public class GuessingGame {
  
   public static void main (String[] args) {
      
      guessingGame();
      
   } // end of main method
   
   public static void instructions(int gameCount) { // writes out the instructions for the game
       
      if (gameCount == 0) {
         System.out.println("~Game Instructions~");
         System.out.println("The game is a guessing game. I will think of a number between 1 ");
         System.out.println("and 100 and will allow you to guess until you get it. For each guess, I will ");
         System.out.println("tell you whether the right answer is higher or lower then your guess.");
         System.out.println();
         System.out.println("Ready? Let's begin!: ");
   
      }
      else {
         System.out.println("Let's play again! Guess a number between 1 and 100");
      }
      return;
     
   } // end instructions method
      
   // Method to make the code for the guessing game work  
   public static int playGame(int gameCount) { 
      Scanner input = new Scanner(System.in);
      // creates a random number
      Random random = new Random();   
      int randomNumber = random.nextInt(101);
      int guessCount = 1;
      
      if(gameCount == 0) {
         System.out.println("I'm thinking of a number between 1 and 100");
      }
      int guess = input.nextInt();
      while(guess != randomNumber) {
         if(guess > randomNumber) {
            System.out.println("The number is lower!");
            guess = input.nextInt();
            guessCount++;
         }
         else {
            System.out.println("The number is higher!");
            guess = input.nextInt();
            guessCount++;
         }
      } // end of while loop
     
      return guessCount;
      
   } // end playGame method
   
   // method to produce the results of the games   
   public static void results(double gameCount, double guessCount, int bestGuess) {
      double avgGame = guessCount / gameCount;
         if(gameCount == 0) {
            System.out.println("Okay, see you next time!:)");
         }
         else {
            System.out.println("You have played " + gameCount + " games!");
            System.out.println("You have made " + guessCount + " guesses!");
            System.out.println("Your best guess was " + bestGuess + "!");
            System.out.println("Your average guesses per game was " + avgGame + "!");
         }
         return;
         } // end of results method
   
   // method to put running code into main that plays the game and makes main small as possible
   public static void guessingGame () {
      
      Scanner input = new Scanner(System.in);

      //defining variables
      int guessCount = 0;
      int gameCount = 0;
      int currentGuess = 0;
      int bestGuess = 1000; 
           
      System.out.println("Hello, would you like to play a game? Yes or No?");
      String play = input.next();
      
      while (play.equals("yes") || play.equals("Yes")) {
         instructions(gameCount);
         currentGuess = playGame(gameCount);
         guessCount = guessCount + currentGuess;
         System.out.println("Congratulations! You have guessed the correct number!");
         System.out.println("Would you like to play again? Yes or No?"); 
         play = input.next();
         
         if (currentGuess < bestGuess) {
            bestGuess = currentGuess;
            }
            gameCount++;
      } // end while loop
     
      results(gameCount, guessCount, bestGuess);
     
   } // end of gamePlay method

} // end of Lab4 class
