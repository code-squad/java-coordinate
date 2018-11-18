package coordinate.domain.Figure;

public enum Type {
    LINE(2),
    TRIANGLE(3),
    RECTANGLE(4);

    private int pointSize;

    Type(int pointSize) {
        this.pointSize = pointSize;
    }

    static Type valueOf(int size) {
        Type[] types = values();
        for (Type type : types) if(type.matchPointSize(size)) return type;
        return null;
    }

    private boolean matchPointSize(int size) {
        return this.pointSize == size;
    }
}

