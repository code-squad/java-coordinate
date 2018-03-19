package domain;

class CoordinatePoint {
    private int position;

    CoordinatePoint(int position) {
        this.position = position;
    }

    public boolean isMatchPosition(int position) {
        return this.position == position;
    }
}
