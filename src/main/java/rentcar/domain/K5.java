package rentcar.domain;

public class K5 extends Car {
    public K5(String name, int tripDistance, int distancePerLiter) {
        super(name, tripDistance, distancePerLiter);
    }

    public K5 (int tripDistance) {
        this("K5", tripDistance, 13);
    }

}
