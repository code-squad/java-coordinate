import java.util.List;

public class Line {
    private Point point1;
    private Point point2;

    public Line(List<String> points){
        point1 = new Point(points.get(0));
        point2 = new Point(points.get(1));
    }

    public Integer sizeOf(List<String> points){
        return points.size();
    }

    public int xDistance(){
        return Math.abs(point2.xValue() - point1.xValue());
    }

    public int yDistance(){
        return Math.abs(point2.yValue() - point1.yValue());

    }

    public double calculateDistance(){
        return Math.sqrt(Math.pow(xDistance(), 2) + Math.pow(yDistance(), 2));
    }


    public void draw(){
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
            printPoint1(x, y);
        }
    }

    public void printPoint1(int x, int y){
            if(point1.yValue() == y && point1.xValue() == x)
                System.out.print(" *");
            System.out.print(" ");
    }

    public void printPoint2(int x, int y){
        if(point2.yValue() == y && point2.xValue() == x)
            System.out.print(" *");
        System.out.print(" ");
    }

    public static void odd(int i){
        if(i % 2 == 0)
            System.out.print(String.format("%2s", i));
    }

    public static void notOdd(int i){
        if (i % 2 != 0)
            System.out.print(String.format("%2s","  "));
    }

    public static void printNumber(){
        System.out.print(String.format("%3s","0"));
        for (int i = 1; i < 25; i++){
            checkNumber(i);
        }
    }

    public static void checkNumber(int i){
        if(i % 2 == 0 && i != 0){
            System.out.print(String.format("%4s",i));
        }
    }
}
