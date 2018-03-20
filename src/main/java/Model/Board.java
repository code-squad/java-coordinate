package Model;

public class Board {

    private Line[] lines = new Line[24];

    private static Board board = new Board();

    public static Board of(){
        return board;
    }

    public void setPoint(int x, int y) {
        this.lines[y] = Line.of(x, y);
    }

    public Point getPoint(int x, int y) {
        return this.lines[y].get(x);
    }

}
