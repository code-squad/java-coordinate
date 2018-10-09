package coordinate;

import java.util.*;

public class CoordinateLine {
    private List<Point> points = new ArrayList<>();

    public CoordinateLine(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0)
                points.add(new Point(numbers.get(i), numbers.get(i + 1)));
        }
    }

    public double findLineLength() {
        return points.get(0).CalculatorLength(points.get(1));
    }

    public List<Point> getPoints() {
        return points;
    }
}
