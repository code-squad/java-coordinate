package connrdinates.domain;

import org.slf4j.Logger;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class Rectangle extends Figure {
    private static final int SIZE = 4;
    private static final String NAME = "Rectangle";
    private static final Logger log = getLogger(Rectangle.class);

    public Rectangle(List<Point> points) {
        super(points);

        if(!valid()){
            throw new IllegalArgumentException("사각형의 형태가 아닙니다. 다시 입력하세요.");
        }

    }

    public boolean sizeCheck(){
        return points.size() == SIZE;
    }

    @Override
    public boolean valid(){
        if(points.get(0).getMath(points.get(3))/2 == points.get(1).getMath(points.get(2))/2 && sizeCheck()){
            return true;
        }
        return false;
    }

    @Override
    public String name(){
        return NAME;
    }

    @Override
    public double area(){
        double x = points.get(0).getMath(points.get(1));
        double y = points.get(0).getMath(points.get(2));
        return x*y;
    }
}
