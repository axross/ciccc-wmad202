package lab3;

public class Pawn extends ChessPiece {
    private String name = "Pawn";

    public String getName() {
        return hasBeenPromoted
            ? String.format(
                "Promoted %s as %s",
                name.toLowerCase(),
                newPiece.getName().toLowerCase()
            )
            : name;
    }

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
    public String getMove() {
        return newPiece == null ? MOVE : newPiece.getMove();
    }


    private static String MOVE = "forward 1";
}