package lab3;

public class King extends ChessPiece {
    public String getName() {
        return NAME;
    }

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
    public String getMove() {
        return MOVE;
    }

    private static String NAME = "King";

    private static String MOVE = "one square";
}