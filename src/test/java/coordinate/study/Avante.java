package coordinate.study;

public class Avante extends Car{
    private static final double DISTANCE_PER_LITER = 15;
    private static final String NAME = "Avante";

    private double tripDistance;

    public Avante(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    @Override
    double getTripDistance() {
        return this.tripDistance;
    }

    @Override
    String getName() {
        return NAME;
    }
}
