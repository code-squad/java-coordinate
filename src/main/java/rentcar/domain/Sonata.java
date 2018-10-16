package rentcar.domain;

public class Sonata extends Car{

    public Sonata(String name, int tripDistance, int distancePerLiter) {
        super(name, tripDistance, distancePerLiter);
    }

    public Sonata (int tripDistance) {
        this("Sonata", tripDistance, 10);
    }
}
