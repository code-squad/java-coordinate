package coordinate.domain;

public class Point {
    int positionX;
    int positionY;

    public Point(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int subX(Point point){
        return this.positionX - point.positionX;
    }

    public int subY(Point point){
        return this.positionY - point.positionY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
