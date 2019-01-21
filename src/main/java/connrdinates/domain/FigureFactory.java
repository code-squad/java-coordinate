package connrdinates.domain;

import org.slf4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.slf4j.LoggerFactory.getLogger;

public class FigureFactory {
    private static final Logger log = getLogger(FigureFactory.class);

    public static Figure criteFigure(List<Point> point){
        return figureList(point).get(point.size());
    }

    public static Map<Integer, Figure> figureList(List<Point> points){
        Map<Integer, Figure> figureList = new HashMap<>();
        figureList.put(2, new Line(points));
        figureList.put(3, new Triangle(points));
        figureList.put(4, new Rectangle(points));
        return figureList;
    }
}
