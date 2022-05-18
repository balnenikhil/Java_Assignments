package practice;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args)
    {

        // stores actual and guess number
        int answer, guess;

        // maximum value is 100
        final int MAX = 100;

        Scanner in = new Scanner(System.in);

        // Random instance
        Random rand = new Random();

        boolean correct = false;

        // correct answer
        answer = rand.nextInt(MAX) + 1;

        int trial = 0;

        // loop until the guess is correct
        while (!correct) {

            System.out.println(
                    "Guess a number between 1 and 100: ");

            // guess value
            guess = in.nextInt();

            // if guess is greater than actual
            if (guess > answer) {
                System.out.println("Too high, try again");
            }

            // if guess is less than actual
            else if (guess < answer) {
                System.out.println("Too low, try again");
            }

            // guess is equal to actual value
            else {

                System.out.println(
                        "Yes, you guessed the number in " +trial+ " trials");

                correct = true;
            }
            trial++;
        }
    }
}
