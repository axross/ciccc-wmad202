package week1.classes;

public class Driver {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 7);
        Rectangle rectangle2 = new Rectangle(10, 2, "Green");
        Rectangle rectangle3 = new Rectangle(15, 12, "Red");

        rectangle1.draw();

        System.out.println("");

        rectangle2.draw();

        System.out.println("");

        rectangle3.draw();
    }
}