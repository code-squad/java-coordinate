package Model;

import java.util.ArrayList;

public class Board {

//    private Line[] lines = new Line[24];

    private Lines lines = new Lines();

    private static Board board = new Board();

    public static Board of() {
        return board;
    }

//    public void setPoint(Point point){
//        this.lines[point.getY()] = addPoint(point.getX(), point.getY());
//    }

    public void setPoint(Point point) {
        this.lines.setPointAtLine(point);
    }

    private Line addPoint(int x, int y) {
        if (this.lines[y] == null) return Line.of(x, y);
        return setOtherPoint(x, y);
    }

    private Line setOtherPoint(int x, int y) {
        return lines[y].setPoint(x, y);
    }

    public Point getPoint(int x, int y) {
        return this.lines[y].get(x);
    }

    public boolean isEmpty(int x, int y) {
        if (lines[y] == null) return true;
        if (lines[y].isEmptyPoint(x)) return true;
        return false;
    }

    public void setFigure(Figure figure) {
        ArrayList<Point> points = figure.getPoints();
        for (Point point : points) {
            board.setPoint(point);
        }
    }
}
