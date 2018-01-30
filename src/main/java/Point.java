import java.util.Arrays;
import java.util.List;

public class Point {
    private int x, y;

    public Point(String points){
        String info = points.substring(1 , points.length()-1);
        List<String> xyDivide = Arrays.asList(info.split(","));
        x = Integer.parseInt(xyDivide.get(0));
        y = Integer.parseInt(xyDivide.get(1));
    }

    public Integer xValue(){
        return x;
    }

    public Integer yValue(){
        return y;
    }

}
