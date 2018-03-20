package View;

import Controller.Calculator;
import Model.Board;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ResultView {

    public static void printBoard(Calculator controller) {
        Board board = controller.getBoard();
        for (int y = 23; y >= 0; y--) {
            print(drawYaxis(y));
            print(drawLine(y, board));
            System.out.println();
        }
        drawXaxis();
    }

    private static void print(String string) {
        System.out.print(string);
    }

    static String drawYaxis(int y){
        if ((y + 1) % 2 == 0) return String.format("%6d", y + 1) + "|";
        return "      |";
        }

    static String drawPoint(int x, int y, Board board){
        try {
            return board.getPoint(x, y).toString();
        } catch (NullPointerException e) {
            return "   ";
        }
    }

    // yet not perfect logic
    static String drawLine(int y, Board board){
        return IntStream.range(0, 24).mapToObj(i -> drawPoint(i, y, board)).collect(Collectors.joining(""));
    }

    static String drawXaxisLine(){
        return IntStream.range(0, 24).mapToObj(i -> "----").collect(Collectors.joining(""));
    }

    static String drawXaxisNumber() {
        return IntStream.range(0, 13).mapToObj(i -> String.format("%7d", 2 * i)).collect(Collectors.joining(""));
    }

    private static void drawXaxis(){
        print("      "+drawXaxisLine());
        System.out.println();
        print(drawXaxisNumber());
    }
}
