package connrdinates.domain;

import org.slf4j.Logger;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.slf4j.LoggerFactory.getLogger;

public class Line extends Figure{

    private static final int SIZE = 2;
    private static final String NAME = "Line";
    private static final Logger log = getLogger(Line.class);

    public Line(List<Point> points) {
        super(points);

        if(!valid()){
            throw new IllegalArgumentException("중복된 좌표가 있습니다. 다시 입력하세요.");
        }
    }

    @Override
    public boolean valid() {
        Set<Point> pointSize = new HashSet<>();
        for (Point point : points) {
            pointSize.add(point);
        }
        return pointSize.size() == SIZE;
    }

    @Override
    public String name(){
        return NAME;
    }

    @Override
    public double area() {
        return points.get(0).getMath(points.get(1));
    }
}
