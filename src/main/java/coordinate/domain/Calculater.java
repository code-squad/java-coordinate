package coordinate.domain;

import java.util.HashMap;

public class Calculater {
	public static final int SQUARELINE = 4;
	public static final String XAXIS = "x";
	public static final String YAXIS = "y";
	public static final int AXIS = 0;
	public Coordinates inputCoordinates;

	public Calculater(Coordinates inputCoordinates) {
		this.inputCoordinates = inputCoordinates;
	}

	public double calcTwoPointDistance() {
		return Math.sqrt(Math.pow(inputCoordinates.getxAxis(AXIS) - inputCoordinates.getxAxis(AXIS + 1), 2)
				+ Math.pow(inputCoordinates.getyAxis(AXIS) - inputCoordinates.getyAxis(AXIS + 1), 2));
	}

	public double calcTwoPointDistance(int axis) {
		if (axis == 2) {
			return Math.sqrt(Math.pow(inputCoordinates.getxAxis(AXIS) - inputCoordinates.getxAxis(axis), 2)
					+ Math.pow(inputCoordinates.getyAxis(AXIS) - inputCoordinates.getyAxis(axis), 2));
		}
		return Math.sqrt(Math.pow(inputCoordinates.getxAxis(AXIS) - inputCoordinates.getxAxis(AXIS + 1), 2)
				+ Math.pow(inputCoordinates.getyAxis(AXIS) - inputCoordinates.getyAxis(AXIS + 1), 2));
	}

	public double calcThreePointDistance() {
		double a = calcTwoPointDistance(0);
		double b = calcTwoPointDistance(1);
		double c = calcTwoPointDistance(2);
		double s = (a + b + c) / 2;
		return s;
	}

	public int calcFourPoint() {
		int result = 0;
		for (int i = 0; i < inputCoordinates.size(); i++) {
			result = Math.abs((int) calcFourPoint(i));
		}
		return result;
	}

	public double calcFourPoint(int i) {
		int width = 0;
		int height = 0;
		for (int j = 1; j < inputCoordinates.size(); j++) {
			if (!inputCoordinates.isSameAxis(i, j, XAXIS)) {
				width = inputCoordinates.distanceTwoAxis(i, j, XAXIS);
			}
			if (!inputCoordinates.isSameAxis(i, j, YAXIS)) {
				height = inputCoordinates.distanceTwoAxis(i, j, YAXIS);
			}
		}
		return width * height;
	}

	public Boolean isSquare() {
		HashMap<String, Integer> tempMap = new HashMap<>();
		tempMap.put("xTemp", 0);
		tempMap.put("yTemp", 0);
		for (int i = 0; i < inputCoordinates.size() - 1; i++) {
			tempMap = calcIsSquare(i, tempMap);
		}

		if ((tempMap.get("xTemp") + tempMap.get("yTemp")) == 4) {
			return true;
		}

		return false;
	}

	public HashMap<String, Integer> calcIsSquare(int i, HashMap<String, Integer> temp) {
		for (int j = i + 1; j < inputCoordinates.size(); j++) {
			temp = calcSameAxis(i, j, temp);
		}
		return temp;
	}

	public boolean isTriangle() {
		HashMap<String, Integer> tempMap = new HashMap<>();
		tempMap.put("xTemp", 0);
		tempMap.put("yTemp", 0);
		for (int i = 0; i < inputCoordinates.size() - 1; i++) {
			tempMap = calcIsTriangle(i, tempMap);
		}
		if (tempMap.get("xTemp") == 3 || tempMap.get("yTemp") == 3) {
			return false;
		}

		return true;
	}

	public HashMap<String, Integer> calcIsTriangle(int i, HashMap<String, Integer> temp) {
		for (int j = i + 1; j < inputCoordinates.size(); j++) {
			temp = calcSameAxis(i, j, temp);
		}
		return temp;
	}

	public HashMap<String, Integer> calcSameAxis(int i, int j, HashMap<String, Integer> temp) {
		if (inputCoordinates.isSameAxis(i, j, XAXIS)) {
			temp.replace("xTemp", temp.get("xTemp") + 1);
		}
		if (inputCoordinates.isSameAxis(i, j, YAXIS)) {
			temp.replace("yTemp", temp.get("yTemp") + 1);
		}
		return temp;
	}

}
