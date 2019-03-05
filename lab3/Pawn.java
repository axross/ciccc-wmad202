package lab3;

public class Pawn extends ChessPiece {
    public String getName() {
        return hasBeenPromoted
            ? String.format(
                "Promoted %s as %s",
                NAME.toLowerCase(),
                newPiece.getName().toLowerCase()
            )
            : NAME;
    }

    private int importance = 1;

    private boolean hasBeenPromoted = false;

    ChessPiece newPiece;

    @Override
    public int getImportance() {
        return newPiece == null ? importance : newPiece.getImportance();
    }

    @Override
    protected void setImportance(int importance) {
        if (newPiece == null) {
            this.importance = importance;
        } else {
            this.newPiece.setImportance(importance);
        }
    }

    @Override
    public String getMove() {
        return newPiece == null ? MOVE : newPiece.getMove();
    }

    void promote(ChessPiece newPiece) {
        if (newPiece instanceof Pawn || newPiece instanceof King) {
            throw new Error();
        }

        this.newPiece = newPiece;
        this.hasBeenPromoted = true;
    }

    private static String NAME = "Pawn";

    private static String MOVE = "forward 1";
}