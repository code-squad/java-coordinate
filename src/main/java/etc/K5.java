package etc;

public class K5 extends Car {
    private final int THIRTEEN = 13;
    private final String K5 = "K5";
    private int tripDistance;

    public K5(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return THIRTEEN;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return K5;
    }
}
