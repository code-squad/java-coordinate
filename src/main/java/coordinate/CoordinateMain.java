package coordinate;

import java.util.*;

public class CoordinateMain {
    public static void main(String[] args) {
        while (true) {
            try {
                run();
                break;
            } catch (Exception e) {
                continue;
            }
        }
    }

    public static void run() throws IllegalArgumentException {
        List<Integer> numbers = InputView.extractNum(InputView.inputPoint());

        CoordinateLine line = new CoordinateLine(numbers);

        PrintView.drawVertical(line.getPoints());
        PrintView.drawRow();
        PrintView.rowNumber();
        PrintView.printWhatIs(numbers.size()/2);
        System.out.print(line.judgeDotCount());
    }
}
