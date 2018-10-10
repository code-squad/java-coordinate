package coordinate.dto;

import coordinate.domain.Point;

import java.util.ArrayList;

public class CoordinateDto {
    private ArrayList<PointDTO> pointDTOS = new ArrayList<>();
    private double lineResult;

    public CoordinateDto(ArrayList<Point> points) {
        add(points);
        makeLineResult(points);
    }
    public void add(ArrayList<Point> points) {
        for (Point point : points) {
            this.pointDTOS.add(point.makePointDTO());
        }
    }

    public void makeLineResult(ArrayList<Point> points) {
        this.lineResult = points.get(0).calculateLIne(points.get(1));
    }

    public ArrayList<PointDTO> getPointDTO() {
        return pointDTOS;
    }

    public double getLineResult() {
        return this.lineResult;
    }
}
