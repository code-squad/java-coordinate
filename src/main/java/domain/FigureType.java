package domain;

public enum FigureType {
    LINE(2), TRIANGLE(3), RECTANGLE(4);

    private int size;

    FigureType(int size) {
        this.size = size;
    }

    public static FigureType getType(int size) {
        for (FigureType value : values()) {
            if (value.size == size) return value;
        }
        throw new IllegalArgumentException("포인트 개수를 잘 못 입력했습니다.");
    }

    public int getSize(){
        return size;
    }
}
