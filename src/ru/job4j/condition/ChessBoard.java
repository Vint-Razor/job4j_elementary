package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        if (Math.abs(x1 - x2) == (Math.abs(y1 - y2))
                && x1 >= 0 && x2 >= 0 && y1 >= 0 && y2 >= 0) {
            return Math.abs(x1 - x2);
        } else {
            return 0;
        }
    }
}
