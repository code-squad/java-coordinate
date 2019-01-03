package coordinate.controller;

import coordinate.domain.Movement;
import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.util.ArrayList;

public class CoordinateMain {

    public static void main(String[] args) {
        Movement m = new Movement();

        String temporaryPoint = InputView.inputPoint();

        ArrayList<Point> points = new ArrayList<>(m.pointCreate(temporaryPoint));

        ArrayList<Integer> x = new ArrayList<>(m.axis());
        ArrayList<Integer> y = new ArrayList<>(m.axis());

        ResultView.height(x, y, points);
        ResultView.width(m.axis());
        ResultView.distance(points);
    }
}
