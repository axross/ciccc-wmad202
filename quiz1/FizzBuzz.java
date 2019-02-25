package quiz1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Max value? ");

        int maxValue = reader.nextInt();
        reader.nextLine();

        for (int i = 1; i <= maxValue; ++i) {
            String output = "";

            if (i % 3 == 0) {
                output = "Fizz";
            }

            if (i % 5 == 0) {
                output += "Buzz";
            }

            if (output.length() == 0) {
                output = String.format("%d", i);
            }

            System.out.print(output);

            if (i < maxValue) {
                System.out.print(" ");
            }

            if (i % 20 == 0 || i == maxValue) {
                System.out.print("\n");
            }
        }
    }
}
