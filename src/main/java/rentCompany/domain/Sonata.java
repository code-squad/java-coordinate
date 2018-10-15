package rentCompany.domain;

public class Sonata extends Car{
    private double TRIP_KM;
    private double DISTANCE_PER_LITER = 10;
    private String NAME = "SONATA";

    public Sonata(double km) {
        this.TRIP_KM = km;
    }

    @Override
    double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    @Override
    double getTripDistance() {
        return TRIP_KM;
    }

    @Override
    String getName() {
        return NAME;
    }
}
