package rentCompany.domain;

public class Avante extends Car {
    private double TRIP_KM;
    private double DISTANCE_PER_LITER = 15;
    private String NAME = "Avante";


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
