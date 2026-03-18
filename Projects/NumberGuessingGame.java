import java.util.Scanner;
public class NumberGuessingGame{
    public static void NumberGuessingGame(){
        Scanner sc = new Scanner(System.in);
        //Math.random() returns a random number between 0 and 1
        //Multiplying it by 100 gives a random number between 0 and 100
        int number = (int)(100*Math.random());
        int k = 5; //number of guesses
        System.out.println("A number is between 1 and 100.Guess it!");
        System.out.println("You have 5 guesses.");

        //loop until the user guesses the number
        for(int i = 0; i < k; i++){
            System.out.println("Enter your guess:");
            int guess = sc.nextInt();
            if(guess == number){
                System.out.println("Congratulations! You guessed the number!");
                break;
            }
            else if(guess < number){
                System.out.println("Your guess is too low.");
            }
            else{
                System.out.println("Your guess is too high.");
            }

            //if the user guesses the number 5 times, the game is over
            if(i==k-1){
                System.out.println("You ran out of guesses. The number was " + number);
                break;
            }
        }  
        sc.close();
    }
        public static void main(String[] args) {
            NumberGuessingGame();
        }  
    }
