package coordinate.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoordinateMake {

	public static List<Line> createLine(List<Integer> x, List<Integer> y) {
		List<Line> coordinate = new ArrayList<>();
		for (int i = 0; i < 24; i++) {
			Line line = new Line(x, y, i);
			coordinate.add(line);
		}
		return coordinate;
	}
}
