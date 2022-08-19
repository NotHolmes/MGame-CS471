package models;

public class MGame {
    Board board;
    Player[] players;
    Die[] dice;
    int roundCount;
    int N;

    public MGame(int playerCount, int round){
        board = new Board();
        players = new Player[playerCount];
        dice = new Die[2];
        N = round;
    }

    public void playGame(){
        for(; roundCount < N; roundCount++){
            playRound();
        }
    }

    private void playRound() {
        for(Player player : players){
            player.takeTurn(board);
        }
    }
}
