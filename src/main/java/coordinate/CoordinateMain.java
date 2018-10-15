package coordinate;

import coordinate.domain.Figure;
import coordinate.domain.Point;
import coordinate.domain.Rectangle;
import coordinate.domain.Triangle;
import coordinate.utill.Parser;
import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class CoordinateMain {
    public static void main(String[] args) {
        while (true) {
            try {
                run(inputText());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("오류 : " + e.getMessage());
            }
        }
    }

    public static List<Point> inputText() {
        List<String> inputValues = Parser.parenthesisRemove(Parser.deshSeparator(InputView.getLocation()));
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < inputValues.size(); i++) {
            points.add(Point.ofCommaSeparator(inputValues.get(i)));
        }
        Parser.overlapCheck(points);
        return points;
    }

    private static void run(List<Point> points) {
        ResultView.createStraight(points);

        if (points.size() == 2) {
            ResultView.distView(points.get(0).distance(points.get(1)));
        }

        if (points.size() == 3) {
            Figure t = new Triangle(points);
            ResultView.areaView(t);
        }

        if (points.size() == 4) {
            Figure r = new Rectangle(points);
            ResultView.areaView(r);
        }
    }
}