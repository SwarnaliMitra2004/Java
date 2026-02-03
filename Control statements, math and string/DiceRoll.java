/*Simulate a dice roll using Math.random() and display the outcome 
(1 to 6).*/

public class DiceRoll {

    public static void main(String[] args) {

        // Generate a random number between 1 and 6
        int dice = (int)(Math.random() * 6) + 1;

        System.out.println("You rolled a dice and got: " + dice);
    }
}
