package Model;

import java.util.ArrayList;

public class Board {

    private Lines lines = new Lines();

    private static Board board = new Board();

    public static Board of() {
        return board;
    }

    public void setPoint(Point point) {
        this.lines.assignPointAtLine(point);
    }

    public void setFigure(Figure figure) {
        ArrayList<Point> points = figure.getPoints();
        for (Point point : points) {
            board.setPoint(point);
        }
    }
}
