package car.example;

public class Avante extends Car {

    private int distancePerLiter;
    private int tripDistance;
    private String name;

    private Avante(int tripDistance) {
        this.tripDistance = tripDistance;
        distancePerLiter = 15;
        name = "Avante";
    }

    public static Car of(int tripDistance) {
        return new Avante(tripDistance);
    }

    double getDistancePerLiter() {
        return distancePerLiter;
    }

    double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String toString() {
        return "Avante";
    }

}
