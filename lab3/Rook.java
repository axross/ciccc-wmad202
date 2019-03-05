package lab3;

public class Rook extends ChessPiece {
    private String name = "Rook";
    
    public String getName() {
        return name;
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

    private static String MOVE = "horizontally or vertically";
}