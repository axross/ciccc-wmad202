package week1.while_loops;

import java.util.Random;

public class DiceDoubles {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("HERE COMES THE DICE!");

        while (true) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;

            System.out.println("");
            System.out.println(String.format("Roll #1: %d", dice1));
            System.out.println(String.format("Roll #2: %d", dice2));
            System.out.println(String.format("The total is %d!", dice1 + dice2));

            if (dice1 == dice2) {
                break;
            }
        }
    }
}
