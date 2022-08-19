package models;

public class Player {
    String name;
    Piece piece;
    Die[] dice;

    public Player(String name){
        this.name = name;
        piece = new Piece();
        dice = new Die[2];
    }

    void takeTurn(Board board){
        Square oldLoc = piece.location;
        Square newLoc;
        int fvTotal = 0;

        for(int i = 0; i < 2; i++){
            dice[i].roll();
            fvTotal += dice[i].faceValue;
        }

        newLoc = board.getSquare(board.findSquareIndex(oldLoc) + fvTotal);
        piece.setLocation(newLoc);
    }
}
