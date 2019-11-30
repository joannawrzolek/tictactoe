package tech.academy.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Position getNextMove() throws IOException {

        Integer x = null;
        Integer y = null;

        try {
            String line = reader.readLine();
            String el[] = line.split(" ");
            x = Integer.parseInt(el[0]);
            y = Integer.parseInt(el[1]);
        }catch (ArrayIndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println("Błędne wprowadzona pozycja, straciłeś kolejkę: ");
        }
        catch (NullPointerException e) {
            //e.printStackTrace();
            System.out.println("Błędne wprowadzona pozycja, straciłeś kolejkę: ");
        }

        Position position = new Position(x, y);
        return position;
    }
}
