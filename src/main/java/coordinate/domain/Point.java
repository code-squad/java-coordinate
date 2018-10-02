package coordinate.domain;

public class Point {
    private int positionX;
    private int positionY;

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

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}
