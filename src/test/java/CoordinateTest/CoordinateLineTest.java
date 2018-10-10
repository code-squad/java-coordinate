package coordinateTest;

import org.junit.Test;

public class CoordinateLineTest {
    @Test
    public void isIntegerTest() {
        int a = 4;
        double b = Math.sqrt(16);
        if (a == (int) b)
            System.out.println("트루");
        System.out.println("거짓");
        System.out.println((int) Math.sqrt(16));
    }
}
