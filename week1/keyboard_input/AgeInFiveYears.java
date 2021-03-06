package week1.keyboard_input;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Hello. What is your name? ");

        String name = reader.nextLine();

        System.out.println("");
        System.out.print(String.format("Hi, %s!  How old are you? ", name));

        int age = reader.nextInt();
        reader.nextLine();

        System.out.println("");
        System.out.println(String.format("Did you know that in five years you will be %d years old?", age + 5));
        System.out.println(String.format("And five years ago you were %d! Imagine that!", age - 5));

        reader.close();
    }

}
