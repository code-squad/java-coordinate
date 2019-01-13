package coordinates.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class LineTest {

    @Test
    public void 입력값0_1(){
        List<Point> p = new ArrayList<>();

        p.add(new Point(22, 18));
        p.add(new Point(10, 18));

        Line line = new Line(p.get(0), p.get(1));

        double a = 12.0;

        assertThat(line.mathPoint()).isEqualTo(a);
    }

    @Test
    public void 입력값0_2(){
        List<Point> p = new ArrayList<>();

        p.add(new Point(22, 18));
        p.add(new Point(10, 10));

        Line line = new Line(p.get(0), p.get(1));

        double a = 14.422205101855956;

        assertThat(line.mathPoint()).isEqualTo(a);
    }

    @Test
    public void 입력값0_3(){
        List<Point> p = new ArrayList<>();

        p.add(new Point(22, 18));
        p.add(new Point(22, 10));

        Line line = new Line(p.get(0), p.get(1));

        double a = 8.0;

        assertThat(line.mathPoint()).isEqualTo(a);
    }
}