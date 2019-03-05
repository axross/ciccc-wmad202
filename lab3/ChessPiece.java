package lab3;

public abstract class ChessPiece {
    public abstract int getImportance();

    protected abstract void setImportance(int importance);

    public abstract void move();

    @Override
    public String toString() {
        return "ChessPiece can move";
    }
}