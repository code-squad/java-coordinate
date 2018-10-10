package coordinate.dto;

import java.util.ArrayList;
import java.util.List;

public class CoordinateResult {
    private List<PointDto> points = new ArrayList<>();

    public void add(PointDto pointDto){
        this.points.add(pointDto);
    }

    public List<PointDto> getPoints() {
        return points;
    }
}
