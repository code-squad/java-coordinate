import model.*;
import view.InputView;
import view.PrintView;

import java.util.List;


public class Main {

    public static void main(String[] args) {
            String coordinateNum = InputView.inputCoordinate();
            Parser.makeStrings(coordinateNum);
        try {
            List<Point> points = PointsFactory.makePoints(coordinateNum);
            AbstractFigures figures = Parser.makeFigures(points);
            PrintView printView = new PrintView();
            printView.printAll(figures, points);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            main(args);
        }
    }
}
