package week1.if_statements;

import java.util.GregorianCalendar;

public class WeekDayName {

    public static void main(String[] args) {
        System.out.println("Weekday 1: " + getWeekdayName(1));
        System.out.println("Weekday 2: " + getWeekdayName(2));
        System.out.println("Weekday 3: " + getWeekdayName(3));
        System.out.println("Weekday 4: " + getWeekdayName(4));
        System.out.println("Weekday 5: " + getWeekdayName(5));
        System.out.println("Weekday 6: " + getWeekdayName(6));
        System.out.println("Weekday 7: " + getWeekdayName(7));
        System.out.println("Weekday 0: " + getWeekdayName(0));
        System.out.println();
        System.out.println("Weekday 43: " + getWeekdayName(43));
        System.out.println("Weekday 17: " + getWeekdayName(17));
        System.out.println("Weekday -1: " + getWeekdayName(-1));

        GregorianCalendar cal = new GregorianCalendar();
        int dow = cal.get(GregorianCalendar.DAY_OF_WEEK);

        System.out.println("\nToday is a " + getWeekdayName(dow) + "!");
    }

    public static String getWeekdayName(int weekdayNumber) {
        if (weekdayNumber == 1) {
            return "Sunday";
        }

        if (weekdayNumber == 2) {
            return "Monday";
        }

        if (weekdayNumber == 3) {
            return "Tuesday";
        }

        if (weekdayNumber == 4) {
            return "Wednesday";
        }

        if (weekdayNumber == 5) {
            return "Thursday";
        }

        if (weekdayNumber == 6) {
            return "Friday";
        }

        if (weekdayNumber == 7 || weekdayNumber == 0) {
            return "Saturday";
        }

        return "error";
    }
}
