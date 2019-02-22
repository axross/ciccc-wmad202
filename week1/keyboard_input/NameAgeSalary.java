package week1.keyboard_input;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Hello. What is your name?");

        String name = reader.nextLine();

        System.out.println("");
        System.out.println(String.format("Hi, %s!  How old are you?", name));

        int age = reader.nextInt();

        System.out.println("");
        System.out.println(String.format("So you're %d, eh?  That's not old at all!", age));
        System.out.println(String.format("How much do you make, %s?", name));

        double wage = reader.nextDouble();

        System.out.println("");
        System.out.println(String.format("%.1f! I hope that's per hour and not per year! LOL!", wage));

        reader.close();
    }
}
