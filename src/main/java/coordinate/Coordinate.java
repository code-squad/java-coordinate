package coordinate;

import coordinate.factory.*;
import java.util.*;

public class Coordinate {
    private List<Point> points = new ArrayList<>();

    public Coordinate(List<Integer> numbers) throws IllegalArgumentException {
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0)
                points.add(new Point(numbers.get(i), numbers.get(i + 1)));
        }
        mismatchPointCount();
        checkSameDot();
    }

    public String createFigure() throws IllegalArgumentException {
        HashMap<Integer, FigureFactory> map = new HashMap<>();
        map.put(2, new LineFactory());
        map.put(3, new TriangleFactory());
        map.put(4, new RectangleFactory());
        return map.get(points.size()).create(points).outputMessage();
    }

    public void mismatchPointCount() {
        if (points.size() < 2 || points.size() > 4)
            throw new IllegalArgumentException("점의 개수는 2개혹은 3개 또는 4개 이어야 합니다.");
    }

    public void checkSameDot() throws IllegalArgumentException {
        for (int i = 0; i < points.size(); i++) {
            if (subCheckSameDot(i))
                throw new IllegalArgumentException("위치가 같은 점(point)이 존재합니다. " + points.size() + " 개점의 위치는 달라야 합니다.");
        }
    }

    private Boolean subCheckSameDot(int i) {
        for (int j = i + 1; j < points.size(); j++) {
            if (points.get(i).equals(points.get(j)))
                return true;
        }
        return false;
    }

    public List<Point> getPoints() {
        return points;
    }
}
