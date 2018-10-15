package rentcar;

public class K5 extends Car{

    public K5(double tripDistance) {
        super(tripDistance);
    }

    @Override
    double getDistancePerLiter() {
        return K5_PER_LITTER;
    }

    @Override
    String getName() {
        return "K5";
    }

}
