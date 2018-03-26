package coordinate.domain;

import java.util.ArrayList;

public abstract class Figure {
	private ArrayList<Point> points;
	
	public Figure(ArrayList<Point> points) {
		this.points = points;
	}
	

	public ArrayList<Point> getPoints() {
		return points;
	}


	public abstract double getArea();

}
