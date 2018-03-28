package domain;

import view.InputView;
import view.ResultView;

import java.util.ArrayList;

public class CoordinateMain {
    public static void main(String[] args) {
        Boolean validation = false;
        LineList lineList = null;
        ArrayList<Point> points = PointList.getPoints();
        while (!validation) {
            try {
                PointList.makePoints(InputView.getCoordinates());
                lineList = new LineList(points);
                validation = Validation.checkValidation(lineList.getLines());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        printResult(points, lineList);
    }

    public static void printResult(ArrayList<Point> points, LineList lineList) {
        Shape shape = ShapeFactory.getInstance(points, lineList);
        ResultView.printPoints(points);
        ResultView.printCalculation(shape);
    }
}
