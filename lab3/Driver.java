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

        System.out.println();

        Pawn smartPawn = new Pawn();

        smartPawn.promote(new Queen());

        System.out.println(smartPawn);

        System.out.println(String.format("Is smart pawn just a pawn?: %s", smartPawn.equals(pawn)));
        System.out.println(String.format("Is smart pawn same as a queen?: %s", smartPawn.equals(queen)));

        Pawn stupidPawn = new Pawn();

        stupidPawn.promote(new Rook());

        System.out.println(String.format("Is smart pawn same as rook pawn?: %s", smartPawn.equals(stupidPawn)));

        Pawn anotherSmartOne = new Pawn();

        anotherSmartOne.promote(new Queen());

        System.out.println(String.format("Are smart pawn and another one friends?: %s", smartPawn.equals(anotherSmartOne)));
    }
}