package week1.while_loops;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner reader = new Scanner(System.in);

        int answer = random.nextInt(10) + 1;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");

        while (true) {
            System.out.print("Your guess: ");

            int guess = reader.nextInt();

            reader.nextLine();

            if (guess == answer) {
                break;
            }

            System.out.println("That is incorrect. Guess again.");
        }

        System.out.println("That's right! You're a good guesser.");

        reader.close();
    }
}
