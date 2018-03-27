package car.example;

public class K5 extends Car {

    private static final int distancePerLiter = 13;

    private K5(int tripDistance) {
        super(tripDistance);
    }

    public static Car of(int tripDistance) {
        return new K5(tripDistance);
    }

    double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    public String toString() {
        return "K5";
    }
}
