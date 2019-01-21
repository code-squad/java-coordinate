package rentcompany.domain;

public class Avante extends Car{

    double tripDistance;
    int distancePerLiter = 15;

    public Avante (double tripDistance){
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return "Avante";
    }

    @Override
    public String toString() {
        return "Avante{" +
                "tripDistance=" + tripDistance +
                ", distancePerLiter=" + distancePerLiter +
                '}';
    }
}
