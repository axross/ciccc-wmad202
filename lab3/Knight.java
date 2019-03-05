package lab3;

public class Knight extends ChessPiece {
    private int importance = 2;

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
        return String.format("Knight (can move %s)", howToMove);
    }

    private static String howToMove = "like an L";
}