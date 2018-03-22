package domain.figure;

import domain.point.Point;
import domain.point.Points;

import java.util.List;

public abstract class Figure {
    private Points pointRepo;

    Figure(Points pointRepo) {
        this.pointRepo = pointRepo;
    }

    public List<Point> getPoints() {
        return pointRepo.getPoints();
    }

    public Point getPoint(int position) {
        return pointRepo.getPoint(position);
    }

    public abstract double calcArea();

    public abstract String getFigureName();
}
