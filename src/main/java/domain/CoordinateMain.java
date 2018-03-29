package domain;

import view.InputView;
import view.ResultView;

import java.util.List;

public class CoordinateMain {
    public static void main(String[] args) {
        Boolean validation = false;
        LineList lineList = null;
        List<Point> points = null;
        while (!validation) {
            try {
                PointList pointList = new PointList(InputView.getCoordinates());
                points = pointList.getPoints();
                lineList = new LineList(points);
                validation = Validation.checkValidation(lineList.getLines());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        printResult(points, lineList);
    }

    public static void printResult(List<Point> points, LineList lineList) {
        Shape shape = ShapeFactory.getInstance(points, lineList);
        ResultView.printPoints(points);
        ResultView.printCalculation(shape);
    }
}
