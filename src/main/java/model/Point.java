package model;

public class Point {

    private int x;
    private int y;

    private Point(int x, int y) {
//        IllegalArgumentException	매개변수가 의도하지 않은 상황을 유발시킬 때
//        IllegalStateException	메소드를 호출하기 위한 상태가 아닐 때
        if (x < 0 || x > 24) {
            throw new IllegalArgumentException("0이상 또는 24 이하만 입력해주십시오.");
        }
        if (y < 0 || y > 24) {
            throw new IllegalArgumentException("0이상 또는 24 이하만 입력해주십시오.");
        }
        this.x = x;
        this.y = y;
    }

    // 항상 view 패키지가 아니면 클래스 메소드를 사용하면 안된다고 생각했었다.
    //팩토리 메소드를 처음 알게 되었고, 자세히 알아보고 써봐야겠다.
    public static Point position(String string) {
        String[] list = string.split(",");
        return new Point(Integer.parseInt(list[0]), Integer.parseInt(list[1]));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isSameXaxis(Point point) {
        return this.x == point.x;
    }

    public boolean isSameYaxis(Point point) {
        return this.y == point.y;
    }

    public int minusXaxis(Point point) {
        return x - point.x;
    }

    public int minusYaxis(Point point) {
        return y - point.y;
    }


    public boolean isPassable(Point point){
        return !(isSameXaxis(point) || isSameYaxis(point));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}

