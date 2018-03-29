package domain;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point getPoint(int x, int y) throws Exception {
        if ((x >= 0 && x < 25) && (y >= 0 && y < 25)) {
            return new Point(x, y);
        }
        throw new Exception("입력 범위를 초과하였습니다. 0~24");
    }

    public static Point getPoint(String x, String y) throws Exception {
        if (x == null || x == null) {
            throw new Exception("(선, 삼각형, 직사각형)을 만들 수 없는 좌표입니다.");
        }
        return getPoint(Integer.parseInt(x), Integer.parseInt(y));
    }

    public Double getDistance(Point otherPoint) {
        int aX = this.getX();
        int aY = this.getY();
        int bX = otherPoint.getX();
        int bY = otherPoint.getY();
        return Math.sqrt(Math.pow((aX - bX), 2) + Math.pow((aY - bY), 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (this.x == point.getX() && this.y == point.getY()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.x;
        result = 31 * result + this.y;
        return result;
    }

    @Override
    public String toString() {
        return "x : " + this.x + ", y : " + this.y;
    }
}
