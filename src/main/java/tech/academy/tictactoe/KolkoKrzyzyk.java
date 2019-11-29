package tech.academy.tictactoe;

import java.io.IOException;

public class KolkoKrzyzyk {

    Player playerX;
    Player playerY;
    Board board;

    public KolkoKrzyzyk(Player playerX, Player playerY, Board board) {
        this.playerX = playerX;
        this.playerY = playerY;
        this.board = board;
    }

    public void run() throws IOException {
        int moveNumber = 1;
        while (!board.isFull()) {
            System.out.println("Is not full yet");
            System.out.println("First player");
            Position position = playerX.getNextMove();
            board.setCell(position.getPositionX(), position.getPositionY(), CellState.X);
            System.out.println("Second player");
            position = playerY.getNextMove();
            board.setCell(position.getPositionX(), position.getPositionY(), CellState.O);
        }
    }
}





