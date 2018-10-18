package coordinate.dto;

import coordinate.domain.Point;

import java.util.ArrayList;
import java.util.List;

public class PointDtoFactory {
    private List<PointDTO> pointDTOS = new ArrayList<>();

    public PointDtoFactory(List<Point> points) {
        add(points);
    }

    private void add(List<Point> points) {
        for (Point point : points) {
            this.pointDTOS.add(point.makePointDTO());
        }
    }

    public List<PointDTO> getPointDTO() {
        return pointDTOS;
    }
}
