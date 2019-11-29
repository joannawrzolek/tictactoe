package tech.academy.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Position getNextMove() throws IOException {

        String line = reader.readLine();
        String el[] = line.split(" ");
        Integer x = Integer.parseInt(el[0]);
        Integer y = Integer.parseInt(el[1]);

        Position position = new Position(x, y);

        return position;
    }
}
