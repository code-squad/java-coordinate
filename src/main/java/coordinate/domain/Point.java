package coordinate.domain;

import coordinate.util.MathHandler;

public class Point {
    private static final int MAX = 24;
    private static final int MIN = 0;

    private int positionX;
    private int positionY;

    public Point(int positionX, int positionY) {
        if(positionX > MAX || positionX < MIN) throw new IllegalArgumentException();
        this.positionX = positionX;
        if(positionY > MAX || positionY < MIN) throw new IllegalArgumentException();
        this.positionY = positionY;
    }

    public double calculateLineLength(Point point){
        return Math.sqrt(MathHandler.squareNumber(point.subPositionX(this.positionX)) +
                MathHandler.squareNumber(point.subPositionY(this.positionY)));

    }

    public int subPositionX(int number){
        return this.positionX - number;
    }

    public int subPositionY(int number){
        return this.positionY - number;
    }


    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
