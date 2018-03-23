package domain;

import view.InputView;
import view.ResultView;

import javax.xml.transform.Result;
import java.util.ArrayList;

public class CoordinateMain {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>(InputView.getCoordinates());
        CoordinateBase coordinateBase = new CoordinateBase(points);

//        for (Line line : coordinateBase.getLines()) {
//            if(line != null) {
//                System.out.println(line.toString());
//            }
//        }
//        for (Point point : points) {
//            System.out.println(point.toString());
//        }
        ResultView.printCoordinates(coordinateBase);
        ResultView.printCalculate(points);
    }
}
