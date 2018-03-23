package domain;

import view.InputView;
import view.ResultView;

import javax.xml.transform.Result;
import java.util.ArrayList;

public class CoordinateMain {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>(InputView.getCoordinates());
        CoordinateBase coordinateBase = new CoordinateBase(points);
        ResultView.printCoordinates(coordinateBase);
        ResultView.printCalculate(points);
    }
}
