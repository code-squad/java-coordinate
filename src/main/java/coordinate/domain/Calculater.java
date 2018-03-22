package coordinate.domain;

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

	public int calcFourPoint() {
		int result = 0;
		for (int i = 0; i < inputCoordinates.size(); i++) {
			result =  Math.abs((int)calcFourPoint(i));
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
		int temp = 0;
		for (int i = 0; i < inputCoordinates.size() - 1; i++) {
			temp = calcIsSquare(i, temp);
		}
		return temp == SQUARELINE;
	}

	public int calcIsSquare(int i, int temp) {
		for (int j = i + 1; j < inputCoordinates.size(); j++) {
			temp = calcSameAxis(i, j, temp);
		}
		return temp;
	}

	public int calcSameAxis(int i, int j, int temp) {
		if (inputCoordinates.isSameAxis(i, j, XAXIS)) {
			temp++;
		}
		if (inputCoordinates.isSameAxis(i, j, YAXIS)) {
			temp++;
		}
		return temp;
	}

}
