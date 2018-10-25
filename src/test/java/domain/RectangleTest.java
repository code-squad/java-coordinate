package domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RectangleTest {

    @Test
    public void chooseThreePointTest(){
        Point p1 = new Point(10,10);
        Point p2 = new Point(22,10);
        Point p3 = new Point(22,18);
        Point p4 = new Point(10,18);
        List<Point> points = new ArrayList<>();
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);
        Rectangle rectangle = new Rectangle(points);
        assertThat(rectangle.area()).isEqualTo(96) ;
    }

    @Test
    public void test2(){
        double v = Math.sqrt((Math.pow((22-10),2))+Math.pow((10-18),2));
        double v2 =Math.sqrt(208);
        v = Math.pow(v,2);
        System.out.println(v);
        System.out.println(v2);
    }

    @Test
    public void test3(){
        double d1 = Math.pow(5,2);
        double d2 = Math.pow(5,2);
        System.out.println(d1+" "+d2);
        if(d1==d2){
            System.out.println("정답");
        }
    }
    @Test public void test4(){
        double a = 64.0;
        double b = 144.0;
        double c = 208.0;
        assertThat(c).isEqualTo(a+b);
    }
    @Test
    public void test5(){
        double d1 = Math.pow(Math.sqrt(Math.pow((2+3),2)),2);
        double d2 = Math.pow(Math.sqrt(Math.pow((4+1),2)),2);
        double d3 = Math.sqrt(Math.pow((2+3),2)+Math.pow((4+1),2));
        double d4 = Math.sqrt(Math.pow((4+1),2)+Math.pow((2+3),2));
        System.out.println(d1+" "+d2);
        if(d1==d2){
            System.out.println("정답");
        }
        System.out.println(d3+" "+d4);
        if(d3==d4){
            System.out.println("정답!");
        }
    }
}
