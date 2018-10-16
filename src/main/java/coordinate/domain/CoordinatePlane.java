package coordinate.domain;

import coordinate.util.InputException;
import coordinate.util.StringUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CoordinatePlane {
    private static final int MAX = 25;
    private final int size;

    public CoordinatePlane() {
        this.size = MAX;
    }

    public int getSize() {
        return size;
    }

    public static ArrayList<Point> enterPoints(String input) throws IllegalArgumentException{
        ArrayList<Point> points = createPoint(input);
        Collections.sort(points);
        return points;
    }

    private static ArrayList<Point> createPoint(String input) throws IllegalArgumentException{
        ArrayList<Point> points = new ArrayList<>();
        String[] inputs = StringUtil.splitStringByDash(input);
        for (String s : inputs) {
            String[] point = StringUtil.splitStringByComma
                    (StringUtil.removeParentheses(s));
            points.add(Point.of(point[0], point[1]));
        }
        return points;
    }

    public Figure createFigure(ArrayList<Point> points) throws InputException {
        checkDuplicate(points);

        FigureMapper fm = new FigureMapper();
        return fm.getFigure(points);
    }

    public void checkDuplicate(ArrayList<Point> points) throws InputException{
        HashSet h = new HashSet();
        h.addAll(points);

        if(points.size() != h.size()) {
            throw new InputException("위치가 같은 점(Point)이 존재합니다. 각 점의 위치는 달라야 합니다.");
        }
    }
}
