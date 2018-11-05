package coordinate.controller;

import coordinate.domain.Movement;
import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class CoordinateMain {

    public static void main(String[] args) {
        Movement m = new Movement();

        String temporaryPoint = InputView.inputPoint();

        List<Point> points = new ArrayList<>(m.pointCreate(temporaryPoint));

        List<Integer> x = new ArrayList<>(m.axis());
        List<Integer> y = new ArrayList<>(m.axis());

        ResultView.height(x, y, points);
        ResultView.width(Movement.axis());
        ResultView.distance(points);
    }
}
