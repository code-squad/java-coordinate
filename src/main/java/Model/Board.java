package Model;

public class Board {


    private static Board board = new Board();

    private Point[][] points = new Point[24][24];

    public void setPoint(int x, int y){
        points[x][y] = Point.pointOf(x, y);
    }

    public static Board of(){
        return board;
    }

    public Point getPoint(int x, int y){
        return points[x][y];
    }
}
