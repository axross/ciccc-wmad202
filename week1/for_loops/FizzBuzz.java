package week1.for_loops;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; ++i) {
            boolean isFizzOrBuzz = false;
            String text = "";

            if (i % 3 == 0) {
                text = "Fizz";
                isFizzOrBuzz = true;
            }

            if (i % 5 == 0) {
                text += "Buzz";
                isFizzOrBuzz = true;
            }

            if (!isFizzOrBuzz) {
                text = String.format("%d", i);
            }

            System.out.println(text);
        }
    }
}
