package coordinate.domain;

import java.util.ArrayList;

public class Coordinates {
	ArrayList<Coordinate> coordinates;

	public Coordinates(ArrayList<Coordinate> coordinates) {
		this.coordinates = coordinates;
	}

	public static Coordinates of(ArrayList<Coordinate> coordinates) {
		return new Coordinates(coordinates);
	}

	public Boolean isSameAxis(int i, int j, String name) {
		if (name.equals("x")) {
			return coordinates.get(i).getxAxis() == coordinates.get(j).getxAxis();
		}
		return coordinates.get(i).getyAxis() == coordinates.get(j).getyAxis();
	}

	public int distanceTwoAxis(int i, int j, String name) {
		if (name.equals("x")) {
			return coordinates.get(i).getxAxis() - coordinates.get(j).getxAxis();
		}
		return coordinates.get(i).getyAxis() - coordinates.get(j).getyAxis();
	}

	public int size() {
		return coordinates.size();
	}

	public int getyAxis(int i) {
		return coordinates.get(i).getyAxis();
	}

	public int getxAxis(int i) {
		return coordinates.get(i).getxAxis();
	}

}
