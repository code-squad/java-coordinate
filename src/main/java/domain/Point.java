package domain;

class Point {
    private int position;

    Point(int position) {
        this.position = position;
    }

    public boolean isMatchPosition(int position) {
        return this.position == position;
    }
}
