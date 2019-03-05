package lab3;

public class Queen extends ChessPiece {
    private String name = "Queen";
    
    public String getName() {
        return name;
    }

    private int importance = 9;

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

    private static String MOVE = "like a bishop or a rook";
}