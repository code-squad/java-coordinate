package dto;

import domain.Point;

import java.util.List;

public class ResultDto {
    private List<Point> points;
    private double value;
    private int countOfPoint;

    public ResultDto(List<Point> points, double value, int countOfPoint) {
        this.points = points;
        this.value = value;
        this.countOfPoint = countOfPoint;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getCountOfPoint() {
        return countOfPoint;
    }

    public void setCountOfPoint(int countOfPoint) {
        this.countOfPoint = countOfPoint;
    }
}
