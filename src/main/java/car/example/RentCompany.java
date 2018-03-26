package car.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {

    private static final String NEWLINE = System.getProperty("line.separator");

    List<Car> cars;

    private RentCompany() {
        this.cars = new ArrayList<Car>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        return cars.stream().map(i -> i.getName() + " : " + (int)i.getChargeQuantity() + "리터").collect(Collectors.joining(NEWLINE));
    }

}