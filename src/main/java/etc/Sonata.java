package etc;

public class Sonata extends Car {
    private final int TEN = 10;
    private final String SONATA = "Sonata";
    private int tripDistance;

    public Sonata(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return TEN;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return SONATA;
    }
}
