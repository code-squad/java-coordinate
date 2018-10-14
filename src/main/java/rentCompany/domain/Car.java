package rentCompany.domain;

public abstract class Car {
    abstract double getDistancePerLiter(); // 연비
    abstract double getTripDistance(); // 여행거리
    abstract String getName(); // 차종

    double getChargeQuantity(){ // 연료량
        return getTripDistance() / getDistancePerLiter();
    }
}
