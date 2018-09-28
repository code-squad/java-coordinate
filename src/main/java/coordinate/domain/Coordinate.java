package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Coordinate {
    public static final int MAX_POSITION = 24;

    public static List<Line> makeLines(){
        List<Line> lines = new ArrayList<>();
        for(int i = 0; i <= MAX_POSITION; i++){
            lines.add(new Line());
        }
        return lines;
    }
}
