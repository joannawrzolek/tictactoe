package tech.academy.tictactoe;

public class Print {
 Board board = new Board();
    public void print() {
        System.out.println(" x\\y| 0 | 1 | 2 |");
        System.out.println(" ----------------");
        System.out.println(
                "  0 | "
                        + board.getCell(0, 0)
                        + " | "
                        + board.getCell(0, 1)
                        + " | "
                        + board.getCell(0, 2)
                        + " |");
        System.out.println(" ----------------");
        System.out.println(
                "  1 | "
                        + board.getCell(1, 0)
                        + " | "
                        + board.getCell(1, 1)
                        + " | "
                        + board.getCell(1, 2)
                        + " |");
        System.out.println(" ----------------");
        System.out.println(
                "  2 | "
                        + board.getCell(2, 0)
                        + " | "
                        + board.getCell(2, 1)
                        + " | "
                        + board.getCell(2, 2)
                        + " |");
        System.out.println(" ----------------");
    }
}
