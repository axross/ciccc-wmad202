package week1.classes;

public class Rectangle {
    Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
        setColor("Blue");
    }

    Rectangle(int width, int height, String color) {
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    private int width;

    private int height;

    private String color;

    public int getWidth() {
        return this.width;
    }

    private final void setWidth(int width) {
        this.width = width > 0 ? width : 1;
    }

    public int getHeight() {
        return this.height;
    }

    private final void setHeight(int height) {
        this.height = height > 0 ? height : 1;
    }

    public String getColor() {
        return this.color;
    }

    private final void setColor(String color) {
        assert color.length() >= 2 && color.length() <= 20 : "color must be 2 to 20 charactors long";

        this.color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public void draw() {
        for (int y = 0; y < this.height; ++y) {
            System.out.println(this.color.substring(0, 1).repeat(this.width));
        }
    }
}