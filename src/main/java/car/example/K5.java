package car.example;

public class K5 extends Car {

    private String name;
    private int tripDistance;
    private int distancePerLiter;

    private K5(int tripDistance) {
        name = "K5";
        this.tripDistance = tripDistance;
        distancePerLiter = 13;
    }

    public static Car of(int tripDistance) {
        return new K5(tripDistance);
    }

    double getDistancePerLiter() {
        return distancePerLiter;
    }

    double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String toString() {
        return "K5";
    }
}
