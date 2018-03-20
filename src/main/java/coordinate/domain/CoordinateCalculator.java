package coordinate.domain;

import coordinate.view.Builder;

import java.util.ArrayList;
import java.util.List;

public class CoordinateCalculator {
    private static final int RANGE = 24;

    private List<Row> rows = new ArrayList<>();

    public CoordinateCalculator(){
        for (int y = 0; y <= RANGE; y++){
            rows.add(new Row(y));
        }
    }

    public String buildCalc(){
        return Builder.startBuild(rows);
    }
}