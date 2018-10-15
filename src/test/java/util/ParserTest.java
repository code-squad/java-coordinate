package util;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ParserTest {
//    @Test
//    public void splitHyphenTest() {
//        Parser p = new Parser("(10,10)-(14,15)");
//        String result[] = p.splitHyphen();
//        assertThat(result[0]).isEqualTo("(10,10)");
//        assertThat(result[1]).isEqualTo("(14,15)");
//    }
//
//    @Test
//    public void removeBracketTest() {
//        Parser p = new Parser("test");
//        String[] str = {"(10,10)"};
//        String[] result = p.removeBracket(str);
//        assertThat(result[0]).isEqualTo("10,10");
//        str[0] = "(1,5)";
//        String[] result2 = p.removeBracket(str);
//        assertThat(result2[0]).isEqualTo("1,5");
//    }
//
//    @Test
//    public void splitCommaTest() {
//        String str = "10,20";
//        Parser p = new Parser("10");
//        String result[] = p.splitComma(str);
//        assertThat(result[0]).isEqualTo("10");
//        assertThat(result[1]).isEqualTo("20");
//    }
//
//    @Test
//    public void stringToIntegerTest() {
//        String[] str = {"10", "20"};
//        Parser p = new Parser("10");
//        Integer[] result = p.stringToInteger(str);
//        assertThat(result[0]).isEqualTo(10);
//        assertThat(result[1]).isEqualTo(20);
//    }

    @Test
    public void makePositionTest() {
        List<Integer[]> v = Parser.makePosition("(10,10)-(14,15)");
        assertThat(v.get(0)[0]).isEqualTo(10);
        assertThat(v.get(0)[1]).isEqualTo(10);
        assertThat(v.get(1)[0]).isEqualTo(14);
        assertThat(v.get(1)[1]).isEqualTo(15);
    }
}
