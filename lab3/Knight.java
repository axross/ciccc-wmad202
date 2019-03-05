package lab3;

public class Knight extends ChessPiece {
    private String name = "Knight";
    
    public String getName() {
        return name;
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

    private static String MOVE = "like an L";
}