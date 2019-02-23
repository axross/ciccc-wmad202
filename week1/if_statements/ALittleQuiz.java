package week1.if_statements;

import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Are you ready for a quiz?: ");

        String YesOrNo = reader.nextLine();
        int point = 0;

        if (YesOrNo.toLowerCase().equals("y") || YesOrNo.toLowerCase().equals("yes")) {
            System.out.println("Okay, here it comes!");
            System.out.println("");

            point += interactQuestion(reader,
                    "Q1) What is the capital of Alaska?\n    1) Melbourne\n    2) Anchorage\n    3) Juneau", 3,
                    "Juneau is the capital of Alaska!") ? 1 : 0;

            System.out.println("");

            point += interactQuestion(reader,
                    "Q2) Can you store the value \"cat\" in a variable of type int?\n    1) yes\n    2) no", 2,
                    "Sorry, \"cat\" is a string. ints can only store numbers.") ? 1 : 0;

            System.out.println("");

            point += interactQuestion(reader, "Q3) What is the result of 9+6/3?\n    1) 5\n    2) 11\n    3) 15/3", 2,
                    "The answer is 11!") ? 1 : 0;

            System.out.println("");

            System.out.println(String.format("Overall, you got %d out of 3 correct.\nThanks for playing!", point));
        } else {
            System.out.println("Okay, see yo again!");
        }

        reader.close();
    }

    private static boolean interactQuestion(Scanner reader, String question, int answerNumber,
            String messageForIncorrectAnswer) {
        System.out.println(question);
        System.out.println("");

        System.out.print("> ");

        int number = reader.nextInt();

        reader.nextLine();
        System.out.println("");

        boolean isCorrect = number == answerNumber;

        if (isCorrect) {
            System.out.println("That's right!");
        } else {
            System.out.println(messageForIncorrectAnswer);
        }

        return isCorrect;
    }
}
