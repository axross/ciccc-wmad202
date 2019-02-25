package quiz1;

public class Circle {
    Circle(double radius) {
        this.radius = radius;
    }

    private final double radius;

    public double getRadius() {
        return radius;
    }

    public double area() {
        return radius * radius * Math.PI;
    }

    public double circumference() {
        return radius * 2 * Math.PI;
    }

    public static void main(String[] args) {
        Circle c = new Circle(1.23456789);

        System.out.println(String.format("radius: %.4f", c.radius));
        System.out.println(String.format("area: %.4f", c.area()));
        System.out.println(String.format("circumference: %.4f", c.circumference()));
    }
}
