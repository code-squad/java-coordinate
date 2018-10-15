package coordinate;

import coordinate.domain.*;
import coordinate.utill.Parser;
import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.util.ArrayList;
import java.util.HashMap;
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

        HashMap<Integer, AbstractFigure> map = new HashMap<>();
        try {
            map.put(2, new Line(points));
            map.put(3, new Triangle(points));
            map.put(4, new Rectangle(points));
            ResultView.areaView(map.get(points.size()));
        }catch (NullPointerException e){
            throw new IllegalArgumentException("좌표의 개수를 정확하게 맞추세요.");
        }

//        if (points.size() == 2) {
//            ResultView.distView(points.get(0).distance(points.get(1)));
//        }
//
//        if (points.size() == 3) {
//            AbstractFigure t = new Triangle(points);
//            ResultView.areaView(t);
//        }
//
//        if (points.size() == 4) {
//            AbstractFigure r = new Rectangle(points);
//            ResultView.areaView(r);
//        }
    }
}