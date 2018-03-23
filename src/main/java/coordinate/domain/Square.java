package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Square {
	private Point standard;
	private Point oppositionPoint;

	public Square(List<Point> points) {
		check(points);
	}

	public double area() {
		double width = standard.getWidth(oppositionPoint);
		double height = standard.getHeight(oppositionPoint);
		return width * height;
	}

	public void findOppositionPoint(List<Point> points) { // 서로 대각선에 있는 점을 찾는다.
		standard = points.get(0);
		for (int i = 1; i < points.size(); i++) {
			if (standard.isNotSameXY(points.get(i))) { // X,Y가 겹치지 않는 점을 찾는다.
				oppositionPoint = points.get(i);
			}
		}
	}

	public void check(List<Point> points) {
		for (int i = 0; i < points.size(); i++) {
			int num = checkRectangle(points, i);
			checkException(num);
		}
	}

	public int checkRectangle(List<Point> points, int i) {
		int num = 0;
		for (int j = 0; j < points.size(); j++) {
			if (i != j && points.get(i).isSameXOrY(points.get(j))) {
				num++;
			}
		}
		return num;
	}

	public void checkException(int num) {
		if (num != 2) {
			throw new IllegalArgumentException("직사각형이 아닙니다.");
		}
	}
}
