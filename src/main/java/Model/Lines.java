package Model;

public class Lines {

    private Line[] lines = new Line[24];

    public void assignPointAtLine(Point point) {
        this.lines[point.getY()] = addPoint(point.getX(), point.getY());
    }

    private Line addPoint(int x, int y) {
        if (this.lines[y] == null) return Line.of(x, y);
        return setOtherPoint(x, y);
    }

    private Line setOtherPoint(int x, int y) {
        return lines[y].setPoint(x, y);
    }

}
