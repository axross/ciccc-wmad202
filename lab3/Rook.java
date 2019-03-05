package lab3;

public class Rook extends ChessPiece {
    private int importance = 5;

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
        return String.format("Rook (can move %s)", howToMove);
    }

    private static String howToMove = "horizontally or vertically";
}