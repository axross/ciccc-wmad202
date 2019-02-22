package week1.variables;

import java.time.LocalDate;

public class StillUsingVariables {
    public static void main(String[] args) {
        String firstName = "Kohei";
        String lastName = "Asai";
        LocalDate graduatedAt = LocalDate.of(2020, 12, 31);

        System.out.println(
                String.format("My name is %s %s and I'll graduate in %d.", firstName, lastName, graduatedAt.getYear()));
    }
}
