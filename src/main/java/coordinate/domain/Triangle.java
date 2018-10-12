package coordinate.domain;

import java.util.ArrayList;

public class Triangle {
    private final ArrayList<Coordinate> coordinates;

    public Triangle(ArrayList<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public double getArea() {
        double l1 = coordinates.get(0).getDistance(coordinates.get(1));
        double l2 = coordinates.get(1).getDistance(coordinates.get(2));
        double l3 = coordinates.get(2).getDistance(coordinates.get(0));
        double s = (l1 + l2 + l3) / 2;

        return Math.round(Math.sqrt(s * (s - l1) * (s - l2) * (s - l3)));
    }
}
