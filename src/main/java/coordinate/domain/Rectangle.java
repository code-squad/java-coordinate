package coordinate.domain;

// 직사각형의 밑변은 x축과 평행하다고 가정.
public class Rectangle {
    Point leftDownPoint;
    Point leftUpPoint;
    Point rightDownPoint;
    Point rightUpPoint;

    public Rectangle(Point leftDownPoint, Point leftUpPoint, Point rightDownPoint, Point rightUpPoint) {
        this.leftDownPoint = leftDownPoint;
        this.leftUpPoint = leftUpPoint;
        this.rightDownPoint = rightDownPoint;
        this.rightUpPoint = rightUpPoint;
    }
}
