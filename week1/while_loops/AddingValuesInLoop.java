package week1.while_loops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("I will add up the numbers you give me.");

        int total = 0;

        while (true) {
            System.out.print("Number: ");

            int number = reader.nextInt();

            reader.nextLine();

            if (number == 0) {
                break;
            }

            total += number;

            System.out.println(String.format("The total so far is %d.", total));
        }

        System.out.println("");

        System.out.println(String.format("The total is %d.", total));

        reader.close();
    }
}
