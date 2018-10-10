package coordinate.domain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// 직사각형의 밑변은 x축과 평행하다고 가정.
public class Rectangle {
    private static final int ZERO = 0;
    private static final int TWO = 2;

    private List<Point> points;

    public Rectangle(List<Point> points) {
        this.points = points;
        if(isIncludeDuplication() || !isValidCount()) throw new IllegalArgumentException("RectangleException");
    }

    private boolean isIncludeDuplication(){
        Set<Point> newPoints = new HashSet<>();
        for (Point point : this.points) {
            newPoints.add(point);
        }
        return !(this.points.size() == newPoints.size());
    }

    private boolean isValidCount(){
        return this.makeHeightSet().size() == TWO && this.makeWidthSet().size() == TWO;
    }

    public int area() {
        return this.calculateWidth() * this.calculateHeight();
    }

    // default modifier for test
    int calculateWidth(){
        Set<Integer> widthSet = this.makeWidthSet();
        widthSet.remove(ZERO);
        Iterator<Integer> it = widthSet.iterator();
        return it.next();
    }

    // default modifier for test
    int calculateHeight(){
        Set<Integer> heightSet = this.makeHeightSet();
        heightSet.remove(ZERO);
        Iterator<Integer> it = heightSet.iterator();
        return it.next();
    }

    // default modifier for test
    Set<Integer> makeWidthSet(){
        Set<Integer> widthSet = new HashSet<>();
        Point point = points.get(ZERO);
        for (Point target : points) {
            widthSet.add(point.subPositionX(target));
        }
        return widthSet;
    }

    // default modifier for test
    Set<Integer> makeHeightSet(){
        Set<Integer> heightSet = new HashSet<>();
        Point point = points.get(ZERO);
        for (Point target : points) {
            heightSet.add(point.subPositionY(target));
        }
        return heightSet;
    }

}
