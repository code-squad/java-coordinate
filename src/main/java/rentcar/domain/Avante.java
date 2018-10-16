package rentcar.domain;

public class Avante extends Car {

    public Avante (String name, int tripDistance, int distancePerLiter) {
        super(name, tripDistance, distancePerLiter);
    }

    public Avante (int tripDistance) {
        this("Avante", tripDistance, 15);
    }

}
