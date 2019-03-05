package lab3;

public class Driver {
    public static void main(String[] args) {
        ChessPiece pawn = new Pawn();
        ChessPiece knight = new Knight();
        ChessPiece bishop = new Bishop();
        ChessPiece rook = new Rook();
        ChessPiece queen = new Queen();
        ChessPiece king = new King();

        System.out.println(pawn);
        System.out.println(knight);
        System.out.println(bishop);
        System.out.println(rook);
        System.out.println(queen);
        System.out.println(king);

        System.out.println();

        pawn.move();
        knight.move();
        bishop.move();
        rook.move();
        queen.move();
        king.move();
    }
}