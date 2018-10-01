package domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private List<Character> line;

    public Line() {
        line = new ArrayList<>(Axis.MAX_SIZE);
    }
}
