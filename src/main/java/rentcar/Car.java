package rentcar;

public abstract class Car {
    public static final int K5_PER_LITTER = 13;
    public static final int AVANTE_PER_LITTER = 15;
    public static final int SONATA_PER_LITTER = 10;
    private double tripDistance;

    public Car(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    double getTripDistance() {
        return tripDistance;
    };

    /**
     * 차종의 이름
     */
    abstract String getName();

    /**
     * 주입해야할 연료량을 구한다.
     */
    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
