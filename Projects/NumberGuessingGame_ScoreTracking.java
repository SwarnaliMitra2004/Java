//Number guessing game with Unlimited Rounds and Score Tracking

import java.util.Scanner;
public class NumberGuessingGame_ScoreTracking{
    public static void guessingNumberGame(){ 
        Scanner sc = new Scanner(System.in);
        int attempts = 0; //number of attempts
        int score = 0; //score
        int k = 5; //number of guesses
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while(playAgain){
            int number = 1+(int)(100*Math.random()); //generate a random number between 1 and 100
            boolean guessedCorrectly = false;
            System.out.println("A number is between 1 and 100. Guess it!");
            System.out.println("You have 5 guesses.");

            //Give the user k attemps per round
            for(int i=0; i<k; i++){
                System.out.println("Enter your guess:");
                int guess = sc.nextInt();
                attempts++;//increment the number of attempts

                if(guess==number){ //if the user guesses the number
                    System.out.println("Congratulations! You guessed the number!");
                    int points = (k - i) * 10; // Award more points for fewer guesses
                    score += points;
                    System.out.println("You earned " + points + " points!");
                    guessedCorrectly = true;    
                    break; //exit the loop  

                }
                else if(guess<number){ 
                    System.out.println("Your guess is smaller than the number.");
                }else{
                    System.out.println("Your guess is greater than the number.");
                }
            }
            if(!guessedCorrectly){ //if the user did not guess the number
                System.out.println("You ran out of guesses. The number was " + number);
            }
            
            System.out.println("Current Score: " + score);
            System.out.println("Do you want to continue? (y/n)");
            String answer = sc.next();
            if(!answer.equalsIgnoreCase("y")){
                System.out.println("Thanks for playing! Your final score is: " + score);
                playAgain = false; //exit the loop
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        guessingNumberGame();
    
}
}