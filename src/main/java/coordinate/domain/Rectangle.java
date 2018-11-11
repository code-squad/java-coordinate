package coordinate.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.List;

public class Rectangle extends Figure {
    private Rectangle(List<Point> coordinate) {
        super(coordinate);
        isRectangle(coordinate);
    }

    public static Rectangle ofCoordinate(List<Point> coordinate) {
        return new Rectangle(coordinate);
    }

    List<Point> isRectangle(List<Point> coordinate) throws RuntimeException {
        if (makeWidthSet(coordinate).size() != Point.TWO || makeHeightSet(coordinate).size() != Point.TWO) throw new RuntimeException() {};
        return coordinate;
    }

    @Override
    public double getArea() {
        return calculateWidth() * calculateHeight();
    }

    Set<Integer> makeWidthSet(List<Point> coordinate){
        Set<Integer> width = new HashSet<>();
        for (Point point : coordinate) width.add(point.getX());

        return width;
    }

    Set<Integer> makeHeightSet(List<Point> coordinate){
        Set<Integer> height = new HashSet<>();
        for (Point point : coordinate) height.add(point.getY());

        return height;
    }

    int calculateWidth() {
        Set<Integer> width = this.makeWidthSet(coordinate);
        Iterator<Integer> it = width.iterator();

        return Math.abs(it.next() - it.next());
    }

    int calculateHeight() {
        Set<Integer> height = this.makeHeightSet(coordinate);
        Iterator<Integer> it = height.iterator();

        return Math.abs(it.next() - it.next());
    }
}
