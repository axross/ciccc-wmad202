package lab3;

public class Bishop extends ChessPiece {
    private int importance = 3;

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
        return String.format("Bishop (can move %s)", howToMove);
    }

    private static String howToMove = "diagonally";
}