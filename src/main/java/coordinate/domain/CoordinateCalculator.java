package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class CoordinateCalculator {
    private List<Line> lines = new ArrayList<>();

    public CoordinateCalculator() {
        for (int y = 0; y < 24; y++){
            this.lines.add(new Line());
        }
    }

    public List<Line> getLines(){
        return lines;
    }
}