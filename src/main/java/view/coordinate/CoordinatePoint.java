package view.coordinate;

class CoordinatePoint {
    private int position;
    private boolean isDraw;

    CoordinatePoint(int position) {
        this.position = position;
        this.isDraw = false;
    }

    public boolean isMatchPosition(int position) {
        return this.position == position;
    }

    public void drawPosition() {
        if (isDraw) {
            throw new RuntimeException("이미 표시되어있습니다");
        }
        isDraw = true;
    }

    public boolean isDrawPosition() {
        return isDraw;
    }
}
