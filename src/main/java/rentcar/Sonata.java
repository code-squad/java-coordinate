package rentcar;

public class Sonata extends Car{

    public Sonata(double tripDistance) {
        super(tripDistance);
    }

    @Override
    double getDistancePerLiter() {
        return SONATA_PER_LITTER;
    }

    @Override
    String getName() {
        return "Sonata";
    }

}
