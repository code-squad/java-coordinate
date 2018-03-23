package example.rentcompany;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private List<Car> cars = new ArrayList<>();

    private RentCompany() {

    }

    public void addRentCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        /* ArrayList<Car> 저장된 목록에서 Car들을 빼와서 공통 메소드를 호출 */
        return null;
    }
}
