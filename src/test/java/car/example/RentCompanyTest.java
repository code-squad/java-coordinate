package car.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentCompanyTest {
    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    public void report() throws Exception {
        RentCompany company = RentCompany.create(); // factory method를 사용해 생성
        company.addCar(Sonata.of(150));
        company.addCar(K5.of(260));
        company.addCar(Sonata.of(120));
        company.addCar(Avante.of(300));
        company.addCar(K5.of(390));

        String report = company.generateReport();
        assertEquals(
                "Sonata : 15리터" + NEWLINE +
                        "K5 : 20리터" + NEWLINE +
                        "Sonata : 12리터" + NEWLINE +
                        "Avante : 20리터" + NEWLINE +
                        "K5 : 30리터", report);
    }
}