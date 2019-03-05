package lab3;

public class Pawn extends ChessPiece {
    private int importance = 1;

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
        return String.format("Pawn (can move %s)", howToMove);
    }

    private static String howToMove = "forward 1";
}