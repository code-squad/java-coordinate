package rentcompany.domain;

public class Sonata extends Car{

    double tripDistance;
    int distancePerLiter = 10;

    public Sonata (double tripDistance){
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
        return "Sonata";
    }

    @Override
    public String toString() {
        return "Sonata{" +
                "tripDistance=" + tripDistance +
                ", distancePerLiter=" + distancePerLiter +
                '}';
    }
}
