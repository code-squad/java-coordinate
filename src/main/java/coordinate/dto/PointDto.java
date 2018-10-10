package coordinate.dto;

public class PointDto {
    private int positionX;
    private int positionY;

    public PointDto(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}
