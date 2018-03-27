package car.example;

public class Sonata extends Car {

    private String name;
    private int tripDistance;
    private int distancePerLiter;

    private Sonata(int tripDistance) {
        name = "Sonata";
        this.tripDistance = tripDistance;
        distancePerLiter = 10;
    }

    public static Car of(int tripDistance) {
        return new Sonata(tripDistance);
    }

    double getDistancePerLiter() {
        return distancePerLiter;
    }

    double getTripDistance() {
        return tripDistance;
    }

    String getName() {
        return name;
    }
}
