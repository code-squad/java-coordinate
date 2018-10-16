package coordinate;

import java.util.*;

public class CoordinateMain {
    public static void main(String[] args) {
        while (true) {
            try {
                run();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void run() throws IllegalArgumentException {
        List<Integer> numbers = InputView.extractNum(InputView.inputPoint());

        Coordinate line = new Coordinate(numbers);

        PrintView.drawVertical(line.getPoints());
        PrintView.drawRow();
        PrintView.rowNumber();
        System.out.println(line.checkFigure());
    }
}
