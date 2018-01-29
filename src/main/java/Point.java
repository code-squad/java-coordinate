import java.util.Arrays;
import java.util.List;

public class Point {
    private int x, y, size;

    public Point(List <String> points){
        String info = points.get(1).substring(1 , points.get(1).length()-1);
        List<String> xyDivide = Arrays.asList(info.split(","));
        x = Integer.parseInt(xyDivide.get(0));
        y = Integer.parseInt(xyDivide.get(1));
        size = xyDivide.size();
    }

    public Integer xValue(){
        return x;
    }

    public Integer yValue(){
        return y;
    }

    public Integer size(){
        return size();
    }

}
