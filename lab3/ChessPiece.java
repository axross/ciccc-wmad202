package lab3;

public abstract class ChessPiece {
    public abstract String getName();

    public abstract int getImportance();

    protected abstract void setImportance(int importance);

    public abstract String getMove();

    public void move() {
        System.out.println(getMove());
    }

    @Override
    public boolean equals(Object other) {
        return other.getClass() == getClass() &&
            ((ChessPiece) other).getImportance() == getImportance();
    }

    @Override
    public int hashCode() {
        return getImportance();
    }

    @Override
    public String toString() {
        return String.format("%s (can move %s)", getName(), getMove());
    }
}