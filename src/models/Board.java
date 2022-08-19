package models;

public class Board {
    Square[] squares;

    public Board(){
        squares = new Square[40];
    }

    Square getSquare(int i) {
        return squares[i];
    }

    int findSquareIndex(Square square){
        for(int i = 0; i < 40; i++){
            if(squares[i] == square)
                return i;
        }

        // error
        return -1;
    }
}
