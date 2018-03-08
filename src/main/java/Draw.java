import java.util.ArrayList;
import java.util.List;

public class Draw {
    private List<Point> list = new ArrayList<>();
    public Draw(List<String> points){
        for(int i = 0; i < points.size(); i++){
            list.add(new Point(points.get(i)));
        }
    }

    public void drawline(int num){
        for(int y = 24; y > 0; y--){
            odd(y);
            notOdd(y);
            System.out.print("|");
            drawX(y, num);
            System.out.println();
        }
    }

    public void drawX(int y, int num){
        for(int x =0; x < 25; x++){
            printPoint(x, y, num);
        }
    }
    public boolean checkPoint(int x, int y, Point point){
        if(point.xValue() == x && point.yValue() == y)
            return true;
        return false;
    }

    public void printPoint(int x, int y, int num){
        for(int i = 0; i < num; i++){
            printStar(x, y, i);
        }
        System.out.print("  ");
    }

    public void printStar(int x, int y, int i){
        if(checkPoint(x, y, list.get(i)))
            System.out.print("*");
    }

    public void odd(int i){
        if(i % 2 == 0)
            System.out.print(String.format("%2s", i));
    }

    public void notOdd(int i){
        if (i % 2 != 0)
            System.out.print(String.format("%2s","  "));
    }

    public void printNumber(){
        System.out.print(String.format("%3s","0"));
        for (int i = 1; i < 25; i++){
            checkNumber(i);
        }
    }

    public void checkNumber(int i){
        if(i % 2 == 0 && i != 0){
            System.out.print(String.format("%4s",i));
        }
    }
}
