package lab3;

public class King extends ChessPiece {
    private int importance = 1000;

    @Override
    public int getImportance() {
        return importance;
    }

    @Override
    protected void setImportance(int importance) {
        this.importance = importance;
    }

    @Override
    public void move() {
        System.out.println(howToMove);
    }

    @Override
    public String toString() {
        return String.format("King (can move %s)", howToMove);
    }

    private static String howToMove = "one square";
}