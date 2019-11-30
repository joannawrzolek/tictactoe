package tech.academy.tictactoe;

import java.io.IOException;

public class TicTacToe {

    Player playerX;
    Player playerY;
    Board board;
    Print print = new Print();

    public TicTacToe(Player playerX, Player playerY, Board board) {
        this.playerX = playerX;
        this.playerY = playerY;
        this.board = board;
    }

    public void run() throws IOException {
        int moveNumber = 1;
        Print print = new Print();
        board.print();
        while (!board.isFull()) {
            System.out.println("First player");
            Position position = playerX.getNextMove();
            board.setCell(position.getPositionX(), position.getPositionY(), CellState.CellStateEnum.X);
            board.print();
            board.winChecker();
            System.out.println("Second player");

            position = playerY.getNextMove();
            board.setCell(position.getPositionX(), position.getPositionY(), CellState.CellStateEnum.O);
            board.print();
            board.winChecker();
        }
    }
}





