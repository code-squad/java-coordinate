package coordinate.dto;

import coordinate.domain.Point;

import java.util.ArrayList;

public class PointDtoFactory {
    private ArrayList<PointDTO> pointDTOS = new ArrayList<>();

    public PointDtoFactory(ArrayList<Point> points) {
        add(points);
    }

    public void add(ArrayList<Point> points) {
        for (Point point : points) {
            this.pointDTOS.add(point.makePointDTO());
        }
    }

    public ArrayList<PointDTO> getPointDTO() {
        return pointDTOS;
    }
}
