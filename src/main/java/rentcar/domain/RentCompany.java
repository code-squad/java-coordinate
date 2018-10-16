package rentcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private List<Car> cars = new ArrayList<>();

    private RentCompany() {

    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for(Car car : cars) {
            sb.append(String.format("%s : %d리터\n", car.getName(), (int)car.getChargeQuantity()));
        }
        return sb.toString();
    }
}