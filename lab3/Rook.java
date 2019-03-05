package lab3;

public class Rook extends ChessPiece {
    public String getName() {
        return NAME;
    }

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
    public String getMove() {
        return MOVE;
    }

    private static String NAME = "Rook";

    private static String MOVE = "horizontally or vertically";
}