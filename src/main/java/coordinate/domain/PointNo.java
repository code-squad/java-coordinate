package coordinate.domain;

public class PointNo {
    int no;

    PointNo(int no) {
        if (no < 0 || no > 24) {
            throw new IllegalArgumentException("0 ~ 24까지만 입력 가능합니다.");
        }
        this.no = no;
    }

    PointNo(String no) {
        this(Integer.parseInt(no));
    }

    public int getNo() {
        return no;
    }
}
