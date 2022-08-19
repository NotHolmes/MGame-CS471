package models;

public class Piece {
    Square location;

    public Piece(){
        location = new Square();
    }

    void setLocation(Square location){
        this.location = location;
    }
}
