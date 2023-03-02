
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {

    //public static int numberOfGuesses = 0;
    //public static int previousGuess = 0;
    //public static int guessNumber = 0;
    public static void main(String[] args) {
        Random rand = new Random();
        int mysteryNumber = rand.nextInt(10);
        Scanner scan = new Scanner(System.in);
        int guessNumber;
        int guessLimit = 3;
        int numberOfGuesses = 0;
        int previousGuess = 0;
        do {
            System.out.println("Guess a number between 0 and 10 now!");
            guessNumber = scan.nextInt();
            numberOfGuesses++;
            if (guessNumber == previousGuess){
                numberOfGuesses--;
            }
            if (numberOfGuesses > guessLimit) {
                System.out.println("you have made 4 guesses. Game Over. Goodbye");
                break;
            }
            previousGuess = guessNumber;
            if (guessNumber < 1) {
                System.out.println("TOO SMALL DUDE, ENTER NUMBER BETWEEN 0 AND 10");
                //previousGuess = guessNumber;
            } else if (guessNumber > 9) {
                System.out.println("TOO LARGE DUDE, ENTER NUMBER BETWEEN 0 AND 10");
                //previousGuess = guessNumber;
            } else if (guessNumber == mysteryNumber) {
                System.out.println("Congrats!~~ you win! Number of guesses: " + numberOfGuesses);
                break;
            } else if (guessNumber < mysteryNumber) {
                System.out.println("Too small, go higher");
            } else if (guessNumber > mysteryNumber) {
                System.out.println("Too large, go lower");
            }
        } while (guessNumber != mysteryNumber);
    }
}
