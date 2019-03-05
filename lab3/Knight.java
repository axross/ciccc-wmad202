package lab3;

public class Knight extends ChessPiece {
    public String getName() {
        return NAME;
    }

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
    public String getMove() {
        return MOVE;
    }

    private static String NAME = "Knight";

    private static String MOVE = "like an L";
}