package coordinate;

import java.util.*;

public class CoordinateMain {
    public static void main(String[] args) {
        try{
            run();
        }catch (Exception e){
            run();
        }
    }

    public static void run() throws IllegalArgumentException{
        List<Integer> numbers = InputView.extractNum(InputView.inputPoint());

        CoordinateLine line = new CoordinateLine(numbers);

        PrintView.drawVertical(line.getPoints());
        PrintView.drawRow();
        PrintView.rowNumber();
        PrintView.printLength(line.findLineLength());
    }
}
