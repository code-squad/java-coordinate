package rentcompany.domain;

public class K5 extends Car{

    double tripDistance;
    int distancePerLiter = 13;

    public K5 (double tripDistance){
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
        return "K5";
    }

    @Override
    public String toString() {
        return "K5{" +
                "tripDistance=" + tripDistance +
                ", distancePerLiter=" + distancePerLiter +
                '}';
    }
}
