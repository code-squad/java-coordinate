package domain;

import java.util.*;

public class Area {
    private List<Line> lines;

    public Area() {
        lines = new ArrayList<>(Axis.MAX_SIZE);
    }
}
