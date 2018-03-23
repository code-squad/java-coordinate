package coordinate.domain;

import java.util.ArrayList;
import java.util.HashMap;

public class Square {
	private ArrayList<Point> points;

	public Square(ArrayList<Point> points) {
		this.points = points;
	}

	public static Square of(ArrayList<Point> points) {
		return new Square(points);
	}

	public boolean isSquare() {
		HashMap<String, Integer> tempMap = new HashMap<>();
		tempMap.put("xTemp", 0);
		tempMap.put("yTemp", 0);
		for (int i = 0; i < points.size() - 1; i++) {
			tempMap = calcIsSquare(i, tempMap);
		}
		if ((tempMap.get("xTemp") + tempMap.get("yTemp")) == 4) {
			return true;
		}

		return false;
	}

	public HashMap<String, Integer> calcIsSquare(int i, HashMap<String, Integer> temp) {
		for (int j = i + 1; j < points.size(); j++) {
			temp = calcSameAxis(i, j, temp);
		}
		return temp;
	}

	public HashMap<String, Integer> calcSameAxis(int i, int j, HashMap<String, Integer> temp) {
		if (isSameAxis(i, j, "x")) {
			temp.replace("xTemp", temp.get("xTemp") + 1);
		}
		if (isSameAxis(i, j, "y")) {
			temp.replace("yTemp", temp.get("yTemp") + 1);
		}
		return temp;
	}
	

	public double getArea() {
		int result = 0;
		for (int i = 0; i < points.size(); i++) {
			result = Math.abs((int) calcFourPoint(i));
		}
		return result;
	}

	public Boolean isSameAxis(int i, int j, String name) {
		if (name.equals("x")) {
			return points.get(i).getxAxis() == points.get(j).getxAxis();
		}
		return points.get(i).getyAxis() == points.get(j).getyAxis();
	}

	public double calcFourPoint(int i) {
		int width = 0;
		int height = 0;
		for (int j = 1; j < points.size(); j++) {
			if (!isSameAxis(i, j, "x")) {
				width = distanceTwoAxis(i, j, "x");
			}
			if (!isSameAxis(i, j, "y")) {
				height = distanceTwoAxis(i, j, "y");
			}
		}
		return width * height;
	}

	public int distanceTwoAxis(int i, int j, String name) {
		if (name.equals("x")) {
			return points.get(i).getxAxis() - points.get(j).getxAxis();
		}
		return points.get(i).getyAxis() - points.get(j).getyAxis();
	}

}
