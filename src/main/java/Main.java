import model.Parser;
import view.InputView;
import view.PrintView;
import model.Point;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        try {
            String coordinateNum = InputView.inputCoordinate();
            Parser.makeStrings(coordinateNum);
            double figures = Parser.makeFigures();
            PrintView printView = new PrintView();
            printView.printAll(figures);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            main(args);
        }
    }
}
