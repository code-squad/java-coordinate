package domain;

import view.InputView;
import view.ResultView;

import java.util.ArrayList;

public class CoordinateMain {
    public static void main(String[] args) {
        // (10,11)-(12,13)-(14,15)-(16,17)
        Errors errors = null;
        LineList lineList = null;
        ArrayList<Point> points = PointList.getPoints();
        while(errors != Errors.NOT_ERR) {
            try {
                PointList.makePoints(InputView.getCoordinates());
                lineList = new LineList(points);
                errors = Validation.checkValidation(lineList.getLines());
            }catch (SamePointException e) {
                errors = Errors.ERR_DUPLICATE;
            }catch (NullPointerException e) {
                errors = Errors.ERR_RANGE;
            }finally {
                ResultView.printError(errors);
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
