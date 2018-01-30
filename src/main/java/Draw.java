import java.util.List;

public class Draw {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Draw(List<String> points){
        point1 = new Point(points.get(0));
        point2 = new Point(points.get(1));
        point3 = new Point(points.get(2));
        point4 = new Point(points.get(3));
    }

    public void drawline(){
        for(int y = 24; y > 0; y--){
            odd(y);
            notOdd(y);
            System.out.print("|");
            drawX(y);
            System.out.println();
        }
    }

    public void drawX(int y){
        for(int x =0; x < 25; x++){
            printPoint(x, y);
        }
    }

    public void printPoint(int x, int y){
        if((point1.yValue() == y && point1.xValue() == x) || (point2.yValue() == y && point2.xValue() == x) || (point3.yValue() == y && point3.xValue() == x) || (point4.yValue() == y && point4.xValue() == x))
            System.out.print("*");
        System.out.print("  ");

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
