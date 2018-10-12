package coordinate.domain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// 직사각형의 밑변은 x축과 평행하다고 가정.
public class Rectangle extends Figure{
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int FOUR = 4;
    private static final String NAME = "Rectangle";

    public Rectangle(List<Point> points) {
        super(points);
        if(!this.isValid()) throw new IllegalArgumentException("RectangleException");
    }

    @Override
    protected boolean isValid() {
        return this.makeHeightSet().size() == TWO && this.makeWidthSet().size() == TWO;
    }

    @Override
    public double area() {
        return this.calculateWidth() * this.calculateHeight();
    }

    @Override
    public String getName() {
        return NAME;
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
        Point point = super.getPoint(ZERO);
        for (int i = ZERO; i < FOUR; i++){
            widthSet.add(point.subPositionX(super.getPoint(i)));
        }
        return widthSet;
    }

    // default modifier for test
    Set<Integer> makeHeightSet(){
        Set<Integer> heightSet = new HashSet<>();
        Point point = super.getPoint(ZERO);
        for (int i = ZERO; i < FOUR; i++){
            heightSet.add(point.subPositionY(super.getPoint(i)));
        }
        return heightSet;
    }
}
