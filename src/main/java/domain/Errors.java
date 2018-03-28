package domain;

public enum Errors {
    NOT_ERR,
    ERR_RANGE("입력 범위를 초과하였습니다. 0~24"),
    ERR_SHAPE("(선, 삼각형, 직사각형)을 만들 수 없는 좌표입니다."),
    ERR_DUPLICATE("위치가 같은 점(point)이 존재합니다. 세 점의 위치는 달라야 합니다.");

    private String message;

    Errors() {
        this(null);
    }

    Errors(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
