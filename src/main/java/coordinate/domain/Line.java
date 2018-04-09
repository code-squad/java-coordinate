package coordinate.domain;

import java.util.ArrayList;

public class Line extends Figure{

    public Line(ArrayList<String> points) {
        super(points);
    }

    public double distance = super.getPoint(1).length(super.getPoint(0));
}
