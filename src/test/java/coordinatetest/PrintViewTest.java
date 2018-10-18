package coordinateTest;

import coordinate.Point;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PrintViewTest {
    @Test
    public void formatTest() {
        String VERTICAL = "|";
        System.out.println("123456789");
        System.out.println(String.format("%5s", VERTICAL));
    }

    @Test
    public void degreeOfPrecisionTest() {
        assertThat(Math.sqrt(2)).isEqualTo(1.414, offset(0.1));
    }

    @Test
    public void dualPrintTest() {
        String oneToThree = "123";
        String fourToEight = "45678";
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                System.out.print("   ");
                System.out.println(fourToEight);
                continue;
            }
            System.out.print(oneToThree);
            System.out.println(fourToEight);
        }
    }

    @Test
    public void blankWidthTest() {
        String blank = " ";
        for (int i = 0; i < 24; i++) {
            System.out.print("───");
        }
        System.out.println();
        System.out.print(String.format("%71s", blank));
        System.out.print("!");
    }

    @Test
    public void blankSaveToList() {
        String blank = " ";
//        List<String> line = new ArrayList<>();
        System.out.print(10 + "│");
//        line.add(String.format("%8s",blank) + "●");
//        System.out.println(line);
        System.out.println(String.format("%8s", blank) + "●");
    }

    @Test
    public void stringFormatWidthTest() {
        System.out.println(String.format("%2d", 10));
        System.out.println(String.format("%2d", 5));
    }

    @Test
    public void listAddByStringFormat() {
//        int j = 2;
        String blank = " ";
        List<String> blanks = new ArrayList<>();
        blanks.add(String.format("%2s", blank));
        for (int i = 0; i < blanks.size(); i++) {
            System.out.print(blanks.get(i));
        }
        System.out.println("!");
    }

    @Test
    public void stringFormatByVariableTest() {
        int width = 5;
        String formated = "%" + width + "s";
        System.out.println(String.format(formated, "!"));
    }

    @Test
    public void arrayListUsedByStringFormat() {
        List<String> line = new ArrayList<>();
        line.add(String.format("%72s", "!"));
        System.out.println(line.get(0));
    }

    @Test
    public void additionElementInArrayList() {
        List<String> line = new ArrayList<>();
        line.add(String.format("%72s", "!"));
        line.set(0, String.format("%30s", "?"));
        System.out.println(line.get(0));
    }

    @Test
    public void ArraylistaddAllMethodTest() {
        ArrayList<String> line = new ArrayList<>();
        ArrayList<String> line2 = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            line.add("");
        }
        line2.add("1");
        line2.add("               2");

        System.out.println(line);
    }

    @Test
    public void tripleForBreakContinueTest() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 3; k++) {
                    if (k == 0)
                        break;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }

    @Test
    public void downCasting(){
        double a = 2.9;                 //double -> int 로 강제 형변환시 소수점은 버린다.
        System.out.println((int)a);
    }

    @Test
    public void flowTest(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(i +"," + j);
                if (i == 4) {
                    functionReturn();
//                    return;                    // 메서드의 흐름은 자신이 끊어야 함
                }
            }
        }
    }

    public void functionReturn(){
        return;
    }

    @Test
    public void toStringTest(){
        String a = "nanana";
        System.out.println(a);
        System.out.println(a.toString());
    }
}
