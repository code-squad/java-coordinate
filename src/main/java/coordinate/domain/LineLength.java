package coordinate.domain;

import java.util.List;

public class LineLength {

	public static double lineResult(List<Integer> x, List<Integer> y) {
		double width = absoluteValue(x.get(0), x.get(1));
		double height = absoluteValue(y.get(0), y.get(1));
		return LineLength.lineLength(width, height);
	}

	public static double lineLength(double width, double height) {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

	public static double absoluteValue(double one, double another) {
		return Math.abs(one - another);
	}
}
