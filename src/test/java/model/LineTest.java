//package model;
//
//import org.junit.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//
//public class LineTest {
//    Point a = Point.position("1,2");
//    Point b = Point.position("3,4");
//    Line line = new Line();
//
//    public LineTest() throws Exception {
//    }
//
//    @Test
//    public void minusX() {
//        assertThat(line.minusX()).isEqualTo(2);
//    }
//
//    @Test
//    public void minusY() {
//        assertThat(line.minusY()).isEqualTo(2);
//    }
//
//    @Test
//    public void square() {
//        int x = line.minusX();
//        int y = line.minusY();
//        assertThat(line.square(x)).isEqualTo(4);
//        assertThat(line.square(y)).isEqualTo(4);
//    }
//
//    @Test
//    public void lineDistance() {
//        int x = line.minusX();
//        int y = line.minusY();
//        int xSquare = line.square(x);
//        int ySquare = line.square(y);
//        double distance = line.lineDistance();
//        assertThat(distance).isEqualTo(xSquare + ySquare);
//    }
//}
