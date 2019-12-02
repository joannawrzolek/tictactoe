package tech.academy.tictactoe;

public class Board {

    private CellState.CellStateEnum[][] cells = new CellState.CellStateEnum[3][3];
    private String state;



    public Board() {
        this.cells = cells;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = CellState.CellStateEnum.EMPTY;
            }
        }
    }


    public Board setCell(int x, int y, CellState.CellStateEnum cellState) {
        try {
            if (cells[x][y] == CellState.CellStateEnum.EMPTY) {
                cells[x][y] = cellState;
            }
            System.out.println("It is not empty. Try again ");
            cells[x][y] = cellState;

        } catch (ArrayIndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println("It is wrong possition. try again");
            cells[x][y] = cellState;
        }
        return null;
    }

    public String getCell(int x, int y) {
        return cells[x][y].name();
    }


    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[i][j] == CellState.CellStateEnum.EMPTY) {
                    //System.out.println("Is not full yet");
                    return false;
                }
            }
        }
        System.out.println("Is Full");
        return true;
    }

    public void print() {
        System.out.println(" x\\y| 0 | 1 | 2 |");
        System.out.println(" ----------------");
        System.out.println(
                "  0 | "
                        + getCell(0, 0)
                        + " | "
                        + getCell(0, 1)
                        + " | "
                        + getCell(0, 2)
                        + " |");
        System.out.println(" ----------------");
        System.out.println(
                "  1 | "
                        + getCell(1, 0)
                        + " | "
                        + getCell(1, 1)
                        + " | "
                        + getCell(1, 2)
                        + " |");
        System.out.println(" ----------------");
        System.out.println(
                "  2 | "
                        + getCell(2, 0)
                        + " | "
                        + getCell(2, 1)
                        + " | "
                        + getCell(2, 2)
                        + " |");
        System.out.println(" ----------------");
    }

    public boolean winChecker() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j == 0; j++) {
                if ((cells[i][j].name() == cells[i][j + 1].name()) & (cells[i][j + 1].name() == cells[i][j + 2].name()) & cells[i][j].name() != "EMPTY") {
                    System.out.println("You are a Winner !!!!");
                    return true;
                } else if ((cells[i][j].name() == cells[i+1][j].name()) & (cells[i+1][j].name() == cells[i+2][j].name()) & cells[i][j].name() != "EMPTY") {
                    System.out.println("You are a Winner !!!!");
                    return true;
                }else if ((cells[i][j].name() == cells[i+1][j + 1].name()) & (cells[i+1][j+1].name() == cells[i+2][j].name()) & cells[i][j].name() != "EMPTY" & cells[i+2][j+2].name() != "EMPTY") {
                    System.out.println("You are a Winner !!!!");
                    return true;
                } else if ((cells[i + 2][j].name() == cells[i+1][j + 1].name()) & (cells[i+1][j+1].name() == cells[i][j + 2].name()) & cells[i][j].name() != "EMPTY" & cells[i+2][j+2].name() != "EMPTY") {
                    System.out.println("You are a Winner !!!!");
                    return true;
               }
            }
            return true;
        }
        return true;
    }
}
