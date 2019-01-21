package connrdinates.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Triangle extends Figure{
    private static final int SIZE = 3;
    private static final String NAME = "Triangle";

    public Triangle(List<Point> points){
        super(points);

        if(!valid()){
            throw new IllegalArgumentException("삼각형의 형태가 아닙니다. 다시 입력하세요.");
        }
    }

    @Override
    public boolean valid(){
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
    public double area(){
        double a = points.get(0).getMath(points.get(1));
        double b = points.get(1).getMath(points.get(2));
        double c = points.get(2).getMath(points.get(0));
        double m = (a+b+c) / 2;
        return Math.sqrt(m* (m-a) * (m-b) * (m-c));
    }
}
