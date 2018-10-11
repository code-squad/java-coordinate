package coordinate.dto;

public class PointDTO {
    private int xPoint;
    private int yPoint;

    public PointDTO(int x, int y) {
        this.xPoint = x;
        this.yPoint = y;
    }

    public int getXPointDTO() {
        return xPoint;
    }

    public int getYPointDTO() {
        return yPoint;
    }
}
