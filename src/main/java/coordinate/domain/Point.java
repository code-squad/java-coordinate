package coordinate.domain;

import coordinate.dto.PointDto;
import coordinate.util.MathHandler;

import java.util.Objects;

public class Point {
    private static final int MAX = 24;
    private static final int ZERO = 0;
    private static final int MIN = ZERO;

    private int positionX;
    private int positionY;

    public Point(int positionX, int positionY) {
        if(positionX > MAX || positionX < MIN) throw new IllegalArgumentException();
        this.positionX = positionX;
        if(positionY > MAX || positionY < MIN) throw new IllegalArgumentException();
        this.positionY = positionY;
    }

    double calculateLineLength(Point point){
        return Math.sqrt(MathHandler.squareNumber(point.subPositionX(this.positionX)) +
                MathHandler.squareNumber(point.subPositionY(this.positionY)));
    }

    // default modifier for test.
    int subPositionX(int number){
        return Math.abs(this.positionX - number);
    }

    // default modifier for test.
    int subPositionY(int number){
        return Math.abs(this.positionY - number);
    }

    int subPositionX(Point other){
        return other.subPositionX(this.positionX);
    }

    int subPositionY(Point other){
        return other.subPositionY(this.positionY);
    }

    public PointDto pointToDto(){
        return new PointDto(this.positionX, this.positionY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return positionX == point.positionX &&
                positionY == point.positionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionX, positionY);
    }

    @Override
    public String toString() {
        return "Point{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}