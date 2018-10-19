package coordinate;

public class PointNumber {
    private int number;

    public PointNumber(int number) throws IllegalArgumentException {
        if (number < 0 || number > 24)
            throw new IllegalArgumentException("입력 좌표값은 0초과 24미만 값이어야 합니다.");
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
