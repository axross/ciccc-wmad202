package lab3;

public class Bishop extends ChessPiece {
    public String getName() {
        return NAME;
    }

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
    public String getMove() {
        return MOVE;
    }

    private static String NAME = "Pawn";

    private static String MOVE = "diagonally";
}