package car.example;

public class Sonata extends Car {

    private static final int distancePerLiter = 10;

    private Sonata(int tripDistance) {
        super(tripDistance);
    }

    public static Car of(int tripDistance) {
        return new Sonata(tripDistance);
    }

    double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    public String toString() {
        return "Sonata";
    }
}
