package coordinate.domain;

import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void 쉬운넓이구하기() {
<<<<<<< HEAD
        ArrayList<Coordinate> c = CoordinatePlane.enterCoordinates("(0,0)-(3,0)-(0,4)");
=======
        ArrayList<Point> c = CoordinatePlane.enterPoints("(0,0)-(3,0)-(0,4)");
>>>>>>> step4
        Triangle t = new Triangle(c);
        double result = t.getArea();
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void 쉬운한변의길이구하기() {
<<<<<<< HEAD
        ArrayList<Coordinate> c = CoordinatePlane.enterCoordinates("(0,0)-(3,0)-(0,4)");
=======
        ArrayList<Point> c = CoordinatePlane.enterPoints("(0,0)-(3,0)-(0,4)");
>>>>>>> step4
        System.out.println(c);
        double result = c.get(0).getDistance(c.get(1));
        assertThat(result).isEqualTo(4, offset(0.000009));

        result = c.get(1).getDistance(c.get(2));
        assertThat(result).isEqualTo(5, offset(0.000009));

        result = c.get(0).getDistance(c.get(2));
        assertThat(result).isEqualTo(3, offset(0.000009));
    }

    @Test
    public void 넓이구하기() {
<<<<<<< HEAD
        ArrayList<Coordinate> c = CoordinatePlane.enterCoordinates("(10,10)-(14,15)-(20,8)");
=======
        ArrayList<Point> c = CoordinatePlane.enterPoints("(10,10)-(14,15)-(20,8)");
>>>>>>> step4
        Triangle t = new Triangle(c);
        double result = t.getArea();
        assertThat(result).isEqualTo(29.0, offset(0.0001));
    }

    @Test
    public void 한변의길이구하기1() {
<<<<<<< HEAD
        ArrayList<Coordinate> c = CoordinatePlane.enterCoordinates("(10,10)-(14,15)-(20,8)");
=======
        ArrayList<Point> c = CoordinatePlane.enterPoints("(10,10)-(14,15)-(20,8)");
>>>>>>> step4
        System.out.println(c);
        double result = c.get(0).getDistance(c.get(1));
        assertThat(result).isEqualTo(6.403124, offset(0.000009));
    }

    @Test
    public void 한변의길이구하기2() {
<<<<<<< HEAD
        ArrayList<Coordinate> c = CoordinatePlane.enterCoordinates("(10,10)-(14,15)-(20,8)");
=======
        ArrayList<Point> c = CoordinatePlane.enterPoints("(10,10)-(14,15)-(20,8)");
>>>>>>> step4
        System.out.println(c);
        double result = c.get(1).getDistance(c.get(2));
        assertThat(result).isEqualTo(9.219544, offset(0.000009));
    }

    @Test
    public void 한변의길이구하기3() {
<<<<<<< HEAD
        ArrayList<Coordinate> c = CoordinatePlane.enterCoordinates("(10,10)-(14,15)-(20,8)");
=======
        ArrayList<Point> c = CoordinatePlane.enterPoints("(10,10)-(14,15)-(20,8)");
>>>>>>> step4
        System.out.println(c);
        double result = c.get(0).getDistance(c.get(2));
        assertThat(result).isEqualTo(10.198039, offset(0.000009));
    }

}