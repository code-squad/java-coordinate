package rentcar;

public class Avante extends Car{

    public Avante(double tripDistance) {
        super(tripDistance);
    }

    @Override
    double getDistancePerLiter() {
        return AVANTE_PER_LITTER;
    }

    @Override
    String getName() {
        return "Avante";
    }

}
