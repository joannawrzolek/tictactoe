package tech.academy.tictactoe;

import java.io.IOException;

public class Game {
    public static void main(String[] args) throws IOException {
        Player player = new Player();
        TicTacToe tacToe = new TicTacToe(new Player(), new Player(), new Board());
        tacToe.run();
    }


}
