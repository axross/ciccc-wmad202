package week1.for_loops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Count to: ");

        int to = reader.nextInt();

        reader.nextLine();

        for (int i = 0; i <= to; ++i) {
            if (i == 0) {
                System.out.print(String.format("%d", i));
            } else {
                System.out.print(String.format(" %d", i));
            }
        }

        System.out.print("\n");

        reader.close();
    }
}
